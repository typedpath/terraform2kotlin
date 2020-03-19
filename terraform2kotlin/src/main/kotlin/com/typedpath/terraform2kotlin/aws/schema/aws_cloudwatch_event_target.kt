package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_event_target(val rule : String, val arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var target_id: String? = null
  var input_path: String? = null
  var ecs_target: List<Ecs_target>? = null
  var batch_target: List<Batch_target>? = null
  var input: String? = null
  var role_arn: String? = null
  var run_command_targets: List<Run_command_targets>? = null
  var kinesis_target: List<Kinesis_target>? = null
  var sqs_target: List<Sqs_target>? = null
  var input_transformer: List<Input_transformer>? = null
 


class Input_transformer(val input_template : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var input_paths: Map<String, String>? = null
 

}

class Ecs_target(val task_definition_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var platform_version: String? = null
  var task_count: Int? = null
  var group: String? = null
  var launch_type: String? = null
  var network_configuration: List<Network_configuration>? = null
 


class Network_configuration(val subnets : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var security_groups: List<String>? = null
  var assign_public_ip: Boolean? = null
 

}
}

class Batch_target(val job_definition : String, val job_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var array_size: Int? = null
  var job_attempts: Int? = null
 

}

class Run_command_targets(val key : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Kinesis_target() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var partition_key_path: String? = null
 

}

class Sqs_target() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var message_group_id: String? = null
 

}
}
