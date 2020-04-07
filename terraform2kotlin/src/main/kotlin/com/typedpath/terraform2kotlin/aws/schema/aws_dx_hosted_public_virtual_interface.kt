package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_hosted_public_virtual_interface(val bgp_asn : Int, val name : String, val address_family : Address_family, val connection_id : String, val owner_account_id : String, val route_filter_prefixes : List<String>, val vlan : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var amazon_address: String? = null
  var bgp_auth_key: String? = null
  var customer_address: String? = null
 

enum class Address_family(val theValue: String ) {
	 ipv4 ("ipv4"), ipv6 ("ipv6") ;
	override fun toString() = theValue
	}
}
