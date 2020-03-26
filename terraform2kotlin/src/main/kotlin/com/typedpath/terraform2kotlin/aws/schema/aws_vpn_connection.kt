package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpn_connection(val customer_gateway_id : String, val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var transit_gateway_id: String? = null
  var tunnel2_inside_cidr: String? = null
  var tunnel2_preshared_key: String? = null
  var vpn_gateway_id: String? = null
  var static_routes_only: Boolean? = null
  var tunnel1_inside_cidr: String? = null
  var tunnel1_preshared_key: String? = null
  var tags: Map<String, String>? = null
 

}
