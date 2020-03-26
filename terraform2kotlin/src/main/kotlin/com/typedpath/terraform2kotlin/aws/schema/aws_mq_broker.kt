package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_mq_broker(val engine_version : String, val security_groups : List<String>, val engine_type : String, val host_instance_type : String, val user : List<User>, val broker_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var auto_minor_version_upgrade: Boolean? = null
  var deployment_mode: String? = null
  var tags: Map<String, String>? = null
  var apply_immediately: Boolean? = null
  var configuration: List<Configuration>? = null
  var logs: List<Logs>? = null
  var maintenance_window_start_time: List<Maintenance_window_start_time>? = null
  var encryption_options: List<Encryption_options>? = null
  var subnet_ids: List<String>? = null
  var publicly_accessible: Boolean? = null
 


class User(val username : String, val password : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var console_access: Boolean? = null
  var groups: List<String>? = null
 

}

class Logs() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var general: Boolean? = null
  var audit: Boolean? = null
 

}

class Maintenance_window_start_time(val day_of_week : String, val time_of_day : String, val time_zone : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Encryption_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_id: String? = null
  var use_aws_owned_key: Boolean? = null
 

}

class Configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var id: String? = null
  var revision: Int? = null
 

}
fun maintenance_window_start_timeRef(subPath: String = "") = ref(this, "maintenance_window_start_time", subPath)
fun publicly_accessibleRef(subPath: String = "") = ref(this, "publicly_accessible", subPath)
fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun userRef(subPath: String = "") = ref(this, "user", subPath)
fun broker_idRef(subPath: String = "") = ref(this, "broker_id", subPath)
fun encryption_optionsRef(subPath: String = "") = ref(this, "encryption_options", subPath)
fun host_instance_typeRef(subPath: String = "") = ref(this, "host_instance_type", subPath)
fun deployment_modeRef(subPath: String = "") = ref(this, "deployment_mode", subPath)
fun engine_versionRef(subPath: String = "") = ref(this, "engine_version", subPath)
fun logsRef(subPath: String = "") = ref(this, "logs", subPath)
fun configurationRef(subPath: String = "") = ref(this, "configuration", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun broker_nameRef(subPath: String = "") = ref(this, "broker_name", subPath)
fun auto_minor_version_upgradeRef(subPath: String = "") = ref(this, "auto_minor_version_upgrade", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun engine_typeRef(subPath: String = "") = ref(this, "engine_type", subPath)
fun instancesRef(subPath: String = "") = ref(this, "instances", subPath)
fun subnet_idsRef(subPath: String = "") = ref(this, "subnet_ids", subPath)
}
