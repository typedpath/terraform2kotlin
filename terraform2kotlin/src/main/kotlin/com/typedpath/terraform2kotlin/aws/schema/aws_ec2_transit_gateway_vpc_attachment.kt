package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_transit_gateway_vpc_attachment(val transit_gateway_id : String, val vpc_id : String, val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var dns_support: Dns_support? = null
  var tags: Map<String, String>? = null
  var ipv6_support: Ipv6_support? = null
  var transit_gateway_default_route_table_association: Boolean? = null
  var transit_gateway_default_route_table_propagation: Boolean? = null
 

enum class Dns_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Ipv6_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun dns_supportRef(subPath: String = "") = ref(this, "dns_support", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun ipv6_supportRef(subPath: String = "") = ref(this, "ipv6_support", subPath)
fun subnet_idsRef(subPath: String = "") = ref(this, "subnet_ids", subPath)
fun transit_gateway_idRef(subPath: String = "") = ref(this, "transit_gateway_id", subPath)
fun vpc_owner_idRef(subPath: String = "") = ref(this, "vpc_owner_id", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
}
