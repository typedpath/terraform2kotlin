package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_documentation_version(val version : String, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

}