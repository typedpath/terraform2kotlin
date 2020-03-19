package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_transit_gateway_route_table(val transit_gateway_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
