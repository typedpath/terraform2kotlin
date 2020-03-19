package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_transit_gateway() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var amazon_side_asn: Int? = null
  var dns_support: Dns_support? = null
  var tags: Map<String, String>? = null
  var vpn_ecmp_support: Vpn_ecmp_support? = null
  var auto_accept_shared_attachments: Auto_accept_shared_attachments? = null
  var default_route_table_association: Default_route_table_association? = null
  var default_route_table_propagation: Default_route_table_propagation? = null
  var description: String? = null
 

enum class Vpn_ecmp_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Auto_accept_shared_attachments(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Default_route_table_association(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Default_route_table_propagation(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
enum class Dns_support(val theValue: String ) {
	 disable ("disable"), enable ("enable") ;
	override fun toString() = theValue
	}
}
