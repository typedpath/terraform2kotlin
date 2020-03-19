package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_endpoint_subnet_association(val vpc_endpoint_id : String, val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
