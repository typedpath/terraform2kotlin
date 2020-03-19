package com.typedpath.terraform2kotlin.aws.schema

class aws_route_table(val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var propagating_vgws: List<String>? = null
  var route: List<Route>? = null
 


class Route() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var instance_id: String? = null
  var transit_gateway_id: String? = null
  var network_interface_id: String? = null
  var egress_only_gateway_id: String? = null
  var ipv6_cidr_block: String? = null
  var gateway_id: String? = null
  var nat_gateway_id: String? = null
  var vpc_peering_connection_id: String? = null
  var cidr_block: String? = null
 

}
}
