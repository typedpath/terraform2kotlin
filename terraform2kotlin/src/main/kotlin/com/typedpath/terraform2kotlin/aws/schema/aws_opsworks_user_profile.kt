package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_opsworks_user_profile(val ssh_username : String, val user_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ssh_public_key: String? = null
  var allow_self_management: Boolean? = null
 

}
