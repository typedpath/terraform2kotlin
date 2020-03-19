package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_endpoint_route_table_association(val vpc_endpoint_id : String, val route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
