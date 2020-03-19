package com.typedpath.terraform2kotlin.aws.schema

class aws_customer_gateway(val bgp_asn : Int, val ip_address : String, val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
