package com.typedpath.terraform2kotlin.aws.schema

class aws_internet_gateway() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_id: String? = null
  var tags: Map<String, String>? = null
 

}
