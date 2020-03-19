package com.typedpath.terraform2kotlin.aws.schema

class aws_network_acl_rule(val rule_number : Int, val network_acl_id : String, val protocol : String, val rule_action : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cidr_block: String? = null
  var ipv6_cidr_block: String? = null
  var from_port: Int? = null
  var to_port: Int? = null
  var egress: Boolean? = null
  var icmp_type: String? = null
  var icmp_code: String? = null
 

}
