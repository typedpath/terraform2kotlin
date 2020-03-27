package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route_table(val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var propagating_vgws: List<String>? = null
  var route: List<Route>? = null
 


class Route() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var vpc_peering_connection_id: String? = null
  var network_interface_id: String? = null
  var egress_only_gateway_id: String? = null
  var instance_id: String? = null
  var nat_gateway_id: String? = null
  var transit_gateway_id: String? = null
  var cidr_block: String? = null
  var ipv6_cidr_block: String? = null
  var gateway_id: String? = null
 

}
fun route_table_idRef(subPath: String = "") = ref(this, "route_table_id", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun routesRef(subPath: String = "") = ref(this, "routes", subPath)
fun subnet_idRef(subPath: String = "") = ref(this, "subnet_id", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun associationsRef(subPath: String = "") = ref(this, "associations", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun gateway_idRef(subPath: String = "") = ref(this, "gateway_id", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
