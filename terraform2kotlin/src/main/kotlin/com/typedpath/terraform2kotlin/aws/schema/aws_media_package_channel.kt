package com.typedpath.terraform2kotlin.aws.schema

class aws_media_package_channel(val channel_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
 

}