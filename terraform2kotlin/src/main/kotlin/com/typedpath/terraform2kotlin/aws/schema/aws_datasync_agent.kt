package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_datasync_agent() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var tags: Map<String, String>? = null
  var activation_key: String? = null
  var ip_address: String? = null
 

}
