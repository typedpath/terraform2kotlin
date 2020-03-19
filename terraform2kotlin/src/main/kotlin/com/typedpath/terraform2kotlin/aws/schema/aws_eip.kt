package com.typedpath.terraform2kotlin.aws.schema

class aws_eip() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var associate_with_private_ip: String? = null
  var tags: Map<String, String>? = null
  var network_interface: String? = null
  var instance: String? = null
  var public_ipv4_pool: String? = null
  var vpc: Boolean? = null
 

}
