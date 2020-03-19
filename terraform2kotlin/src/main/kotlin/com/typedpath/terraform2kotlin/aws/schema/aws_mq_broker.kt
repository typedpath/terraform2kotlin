package com.typedpath.terraform2kotlin.aws.schema

class aws_mq_broker(val user : List<User>, val security_groups : List<String>, val engine_type : String, val host_instance_type : String, val broker_name : String, val engine_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var publicly_accessible: Boolean? = null
  var maintenance_window_start_time: List<Maintenance_window_start_time>? = null
  var auto_minor_version_upgrade: Boolean? = null
  var configuration: List<Configuration>? = null
  var deployment_mode: String? = null
  var logs: List<Logs>? = null
  var tags: Map<String, String>? = null
  var apply_immediately: Boolean? = null
  var encryption_options: List<Encryption_options>? = null
  var subnet_ids: List<String>? = null
 


class User(val password : String, val username : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var console_access: Boolean? = null
  var groups: List<String>? = null
 

}

class Maintenance_window_start_time(val day_of_week : String, val time_of_day : String, val time_zone : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var id: String? = null
  var revision: Int? = null
 

}

class Logs() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var general: Boolean? = null
  var audit: Boolean? = null
 

}

class Encryption_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_id: String? = null
  var use_aws_owned_key: Boolean? = null
 

}
}
