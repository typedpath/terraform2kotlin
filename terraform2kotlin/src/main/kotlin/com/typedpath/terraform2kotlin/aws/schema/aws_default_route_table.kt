package com.typedpath.terraform2kotlin.aws.schema

class aws_default_route_table(val default_route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var propagating_vgws: List<String>? = null
  var route: List<Route>? = null
  var tags: Map<String, String>? = null
 


class Route() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_block: String? = null
  var instance_id: String? = null
  var vpc_peering_connection_id: String? = null
  var network_interface_id: String? = null
  var cidr_block: String? = null
  var egress_only_gateway_id: String? = null
  var gateway_id: String? = null
  var nat_gateway_id: String? = null
  var transit_gateway_id: String? = null
 

}
}
