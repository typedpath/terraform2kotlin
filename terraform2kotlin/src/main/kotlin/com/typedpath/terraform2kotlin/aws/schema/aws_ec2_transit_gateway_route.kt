package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_transit_gateway_route(val destination_cidr_block : String, val transit_gateway_route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var blackhole: Boolean? = null
  var transit_gateway_attachment_id: String? = null
 

}
