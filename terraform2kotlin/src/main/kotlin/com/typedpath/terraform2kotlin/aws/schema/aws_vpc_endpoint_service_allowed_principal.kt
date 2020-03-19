package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_endpoint_service_allowed_principal(val principal_arn : String, val vpc_endpoint_service_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
