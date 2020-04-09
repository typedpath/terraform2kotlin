package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_transfer_user(val server_id : String, val user_name : String, val role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var home_directory: String? = null
  var policy: String? = null
  var tags: Map<String, String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
