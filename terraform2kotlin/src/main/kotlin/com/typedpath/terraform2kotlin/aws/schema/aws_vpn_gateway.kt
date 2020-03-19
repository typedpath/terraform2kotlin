package com.typedpath.terraform2kotlin.aws.schema

class aws_vpn_gateway() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var amazon_side_asn: String? = null
  var vpc_id: String? = null
  var tags: Map<String, String>? = null
 

}
