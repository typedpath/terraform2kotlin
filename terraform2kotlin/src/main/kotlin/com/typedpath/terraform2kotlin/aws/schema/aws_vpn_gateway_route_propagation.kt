package com.typedpath.terraform2kotlin.aws.schema

class aws_vpn_gateway_route_propagation(val route_table_id : String, val vpn_gateway_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
