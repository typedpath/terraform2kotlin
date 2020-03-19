package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_transit_gateway_vpc_attachment(val vpc_id : String, val subnet_ids : List<String>, val transit_gateway_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var transit_gateway_default_route_table_association: Boolean? = null
  var transit_gateway_default_route_table_propagation: Boolean? = null
  var dns_support: Dns_support? = null
  var ipv6_support: Ipv6_support? = null
 

enum class Ipv6_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Dns_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
}
