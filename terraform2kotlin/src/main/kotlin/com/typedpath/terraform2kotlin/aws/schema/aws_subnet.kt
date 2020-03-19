package com.typedpath.terraform2kotlin.aws.schema

class aws_subnet(val vpc_id : String, val cidr_block : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ipv6_cidr_block: String? = null
  var availability_zone: String? = null
  var tags: Map<String, String>? = null
  var availability_zone_id: String? = null
  var map_public_ip_on_launch: Boolean? = null
  var assign_ipv6_address_on_creation: Boolean? = null
 

}
