package com.typedpath.terraform2kotlin.aws.schema

class aws_route(val route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var gateway_id: String? = null
  var transit_gateway_id: String? = null
  var destination_cidr_block: String? = null
  var network_interface_id: String? = null
  var nat_gateway_id: String? = null
  var egress_only_gateway_id: String? = null
  var instance_id: String? = null
  var vpc_peering_connection_id: String? = null
  var destination_ipv6_cidr_block: String? = null
 

}
