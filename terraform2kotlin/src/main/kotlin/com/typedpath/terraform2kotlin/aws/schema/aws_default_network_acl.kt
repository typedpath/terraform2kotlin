package com.typedpath.terraform2kotlin.aws.schema

class aws_default_network_acl(val default_network_acl_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ingress: List<Ingress>? = null
  var egress: List<Egress>? = null
  var tags: Map<String, String>? = null
  var subnet_ids: List<String>? = null
 


class Ingress(val action : String, val from_port : Int, val to_port : Int, val rule_no : Int, val protocol : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var icmp_code: Int? = null
  var cidr_block: String? = null
  var ipv6_cidr_block: String? = null
  var icmp_type: Int? = null
 

}

class Egress(val from_port : Int, val rule_no : Int, val protocol : String, val to_port : Int, val action : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cidr_block: String? = null
  var icmp_code: Int? = null
  var icmp_type: Int? = null
  var ipv6_cidr_block: String? = null
 

}
}