package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_private_virtual_interface(val name : String, val connection_id : String, val bgp_asn : Int, val address_family : Address_family, val vlan : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpn_gateway_id: String? = null
  var customer_address: String? = null
  var dx_gateway_id: String? = null
  var mtu: Int? = null
  var amazon_address: String? = null
  var bgp_auth_key: String? = null
  var tags: Map<String, String>? = null
 

enum class Address_family(val theValue: String ) {
	 ipv4 ("ipv4"), ipv6 ("ipv6") ;
	override fun toString() = theValue
	}
}
