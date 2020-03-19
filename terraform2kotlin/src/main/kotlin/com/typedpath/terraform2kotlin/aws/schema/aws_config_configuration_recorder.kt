package com.typedpath.terraform2kotlin.aws.schema

class aws_config_configuration_recorder(val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var recording_group: List<Recording_group>? = null
  var name: String? = null
 


class Recording_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource_types: List<String>? = null
  var all_supported: Boolean? = null
  var include_global_resource_types: Boolean? = null
 

}
}
