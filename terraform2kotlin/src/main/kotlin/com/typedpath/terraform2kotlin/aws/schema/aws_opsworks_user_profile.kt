package com.typedpath.terraform2kotlin.aws.schema

class aws_opsworks_user_profile(val user_arn : String, val ssh_username : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ssh_public_key: String? = null
  var allow_self_management: Boolean? = null
 

}
