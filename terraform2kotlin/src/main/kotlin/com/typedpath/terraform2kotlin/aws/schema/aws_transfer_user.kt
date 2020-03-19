package com.typedpath.terraform2kotlin.aws.schema

class aws_transfer_user(val role : String, val server_id : String, val user_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var home_directory: String? = null
  var policy: String? = null
  var tags: Map<String, String>? = null
 

}
