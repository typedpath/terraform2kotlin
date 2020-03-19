package com.typedpath.terraform2kotlin.aws.schema

class aws_lightsail_instance(val name : String, val availability_zone : String, val bundle_id : String, val blueprint_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var key_pair_name: String? = null
  var user_data: String? = null
  var tags: Map<String, String>? = null
 

}
