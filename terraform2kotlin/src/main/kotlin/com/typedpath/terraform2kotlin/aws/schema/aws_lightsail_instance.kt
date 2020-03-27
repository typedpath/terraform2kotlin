package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lightsail_instance(val bundle_id : String, val blueprint_id : String, val name : String, val availability_zone : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var user_data: String? = null
  var key_pair_name: String? = null
  var tags: Map<String, String>? = null
 

}
