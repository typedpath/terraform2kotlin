package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_function_event_invoke_config(val function_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var maximum_event_age_in_seconds: Int? = null
  var maximum_retry_attempts: Int? = null
  var qualifier: String? = null
  var destination_config: List<Destination_config>? = null
 


class Destination_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var on_failure: List<On_failure>? = null
  var on_success: List<On_success>? = null
 


class On_failure(val destination : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class On_success(val destination : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
