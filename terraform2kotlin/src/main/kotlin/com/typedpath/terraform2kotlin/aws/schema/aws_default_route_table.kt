package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_route_table(val default_route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var route: List<Route>? = null
  var tags: Map<String, String>? = null
  var propagating_vgws: List<String>? = null
 


class Route() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var gateway_id: String? = null
  var instance_id: String? = null
  var nat_gateway_id: String? = null
  var transit_gateway_id: String? = null
  var vpc_peering_connection_id: String? = null
  var cidr_block: String? = null
  var ipv6_cidr_block: String? = null
  var egress_only_gateway_id: String? = null
  var network_interface_id: String? = null
 

}
}
