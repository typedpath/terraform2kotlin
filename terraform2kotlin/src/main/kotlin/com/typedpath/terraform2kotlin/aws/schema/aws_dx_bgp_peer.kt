package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dx_bgp_peer(val bgp_asn : Int, val virtual_interface_id : String, val address_family : Address_family) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var customer_address: String? = null
  var amazon_address: String? = null
  var bgp_auth_key: String? = null
 

enum class Address_family(val theValue: String ) {
	 ipv4 ("ipv4"), ipv6 ("ipv6") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
