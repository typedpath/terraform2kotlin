package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_transfer_user(val user_name : String, val role : String, val server_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var home_directory: String? = null
  var policy: String? = null
  var tags: Map<String, String>? = null
 

}
