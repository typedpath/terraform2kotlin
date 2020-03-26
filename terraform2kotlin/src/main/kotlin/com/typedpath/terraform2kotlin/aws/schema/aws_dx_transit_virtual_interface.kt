package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_transit_virtual_interface(val connection_id : String, val vlan : Int, val dx_gateway_id : String, val address_family : Address_family, val name : String, val bgp_asn : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var bgp_auth_key: String? = null
  var mtu: Int? = null
  var tags: Map<String, String>? = null
  var amazon_address: String? = null
  var customer_address: String? = null
 

enum class Address_family(val theValue: String ) {
	 ipv4 ("ipv4"), ipv6 ("ipv6") ;
	override fun toString() = theValue
	}
}
