package com.typedpath.terraform2kotlin.aws.schema

class aws_eip_association() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var network_interface_id: String? = null
  var private_ip_address: String? = null
  var public_ip: String? = null
  var allocation_id: String? = null
  var allow_reassociation: Boolean? = null
  var instance_id: String? = null
 

}