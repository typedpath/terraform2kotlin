package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route(val route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var egress_only_gateway_id: String? = null
  var vpc_peering_connection_id: String? = null
  var destination_ipv6_cidr_block: String? = null
  var nat_gateway_id: String? = null
  var instance_id: String? = null
  var destination_cidr_block: String? = null
  var gateway_id: String? = null
  var network_interface_id: String? = null
  var transit_gateway_id: String? = null
 

fun destination_cidr_blockRef(subPath: String = "") = ref(this, "destination_cidr_block", subPath)
fun gateway_idRef(subPath: String = "") = ref(this, "gateway_id", subPath)
fun nat_gateway_idRef(subPath: String = "") = ref(this, "nat_gateway_id", subPath)
fun vpc_peering_connection_idRef(subPath: String = "") = ref(this, "vpc_peering_connection_id", subPath)
fun route_table_idRef(subPath: String = "") = ref(this, "route_table_id", subPath)
fun destination_ipv6_cidr_blockRef(subPath: String = "") = ref(this, "destination_ipv6_cidr_block", subPath)
fun egress_only_gateway_idRef(subPath: String = "") = ref(this, "egress_only_gateway_id", subPath)
fun instance_idRef(subPath: String = "") = ref(this, "instance_id", subPath)
fun transit_gateway_idRef(subPath: String = "") = ref(this, "transit_gateway_id", subPath)
fun network_interface_idRef(subPath: String = "") = ref(this, "network_interface_id", subPath)
}
