package com.typedpath.terraform2kotlin.aws.schema

class aws_dx_hosted_private_virtual_interface_accepter(val virtual_interface_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var dx_gateway_id: String? = null
  var tags: Map<String, String>? = null
  var vpn_gateway_id: String? = null
 

}
