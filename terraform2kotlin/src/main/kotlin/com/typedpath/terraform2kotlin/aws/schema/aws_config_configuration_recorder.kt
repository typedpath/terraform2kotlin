package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_config_configuration_recorder(val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var recording_group: List<Recording_group>? = null
 


class Recording_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var all_supported: Boolean? = null
  var include_global_resource_types: Boolean? = null
  var resource_types: List<String>? = null
 

}
}
