package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_maintenance_window_task(val service_role_arn : String, val max_concurrency : String, val max_errors : String, val task_type : String, val window_id : String, val task_arn : String, val targets : List<Targets>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var priority: Int? = null
  var logging_info: List<Logging_info>? = null
  var task_parameters: List<Task_parameters>? = null
  var name: String? = null
  var task_invocation_parameters: List<Task_invocation_parameters>? = null
 


class Targets(val key : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Logging_info(val s3_bucket_name : String, val s3_region : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var s3_bucket_prefix: String? = null
 

}

class Task_parameters(val values : List<String>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Task_invocation_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var step_functions_parameters: List<Step_functions_parameters>? = null
  var automation_parameters: List<Automation_parameters>? = null
  var lambda_parameters: List<Lambda_parameters>? = null
  var run_command_parameters: List<Run_command_parameters>? = null
 


class Run_command_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var document_hash: String? = null
  var notification_config: List<Notification_config>? = null
  var service_role_arn: String? = null
  var timeout_seconds: Int? = null
  var comment: String? = null
  var document_hash_type: Document_hash_type? = null
  var output_s3_bucket: String? = null
  var output_s3_key_prefix: String? = null
  var parameter: List<Parameter>? = null
 

enum class Document_hash_type(val theValue: String ) {
	 Sha256 ("Sha256"), Sha1 ("Sha1") ;
	override fun toString() = theValue
	}

class Notification_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var notification_events: List<String>? = null
  var notification_type: Notification_type? = null
  var notification_arn: String? = null
 

enum class Notification_type(val theValue: String ) {
	 Command ("Command"), Invocation ("Invocation") ;
	override fun toString() = theValue
	}
}

class Parameter(val values : List<String>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Step_functions_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var input: String? = null
  var name: String? = null
 

}

class Automation_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var document_version: String? = null
  var parameter: List<Parameter>? = null
 


class Parameter(val name : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Lambda_parameters() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var client_context: String? = null
  var payload: String? = null
  var qualifier: String? = null
 

}
}
}
