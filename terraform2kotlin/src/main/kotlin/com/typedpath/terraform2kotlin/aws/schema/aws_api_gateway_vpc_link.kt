package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_vpc_link(val name : String, val target_arns : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
 

}
