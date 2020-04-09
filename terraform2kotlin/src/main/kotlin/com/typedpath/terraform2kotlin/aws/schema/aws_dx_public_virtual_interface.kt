package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_public_virtual_interface(val connection_id : String, val name : String, val vlan : Int, val route_filter_prefixes : List<String>, val address_family : Address_family, val bgp_asn : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var customer_address: String? = null
  var amazon_address: String? = null
  var bgp_auth_key: String? = null
  var tags: Map<String, String>? = null
 

enum class Address_family(val theValue: String ) {
	 ipv4 ("ipv4"), ipv6 ("ipv6") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
