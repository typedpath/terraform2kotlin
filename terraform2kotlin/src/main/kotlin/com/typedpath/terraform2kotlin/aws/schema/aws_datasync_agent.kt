package com.typedpath.terraform2kotlin.aws.schema

class aws_datasync_agent() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var activation_key: String? = null
  var ip_address: String? = null
  var name: String? = null
 

}
