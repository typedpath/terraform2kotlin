package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_resource(val parent_id : String, val path_part : String, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
