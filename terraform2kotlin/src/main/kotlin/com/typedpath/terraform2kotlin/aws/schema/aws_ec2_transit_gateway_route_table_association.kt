package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_transit_gateway_route_table_association(val transit_gateway_attachment_id : String, val transit_gateway_route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
