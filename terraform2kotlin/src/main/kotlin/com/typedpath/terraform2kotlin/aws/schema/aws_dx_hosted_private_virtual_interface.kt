package com.typedpath.terraform2kotlin.aws.schema

class aws_dx_hosted_private_virtual_interface(val owner_account_id : String, val address_family : Address_family, val bgp_asn : Int, val name : String, val vlan : Int, val connection_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var bgp_auth_key: String? = null
  var customer_address: String? = null
  var amazon_address: String? = null
  var mtu: Int? = null
 

enum class Address_family(val theValue: String ) {
	 ipv4 ("ipv4"), ipv6 ("ipv6") ;
	override fun toString() = theValue
	}
}
