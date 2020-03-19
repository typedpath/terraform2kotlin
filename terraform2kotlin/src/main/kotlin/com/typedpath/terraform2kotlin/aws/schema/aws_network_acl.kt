package com.typedpath.terraform2kotlin.aws.schema

class aws_network_acl(val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var subnet_id: String? = null
  var subnet_ids: List<String>? = null
  var ingress: List<Ingress>? = null
  var egress: List<Egress>? = null
  var tags: Map<String, String>? = null
 


class Ingress(val from_port : Int, val to_port : Int, val rule_no : Int, val action : String, val protocol : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_block: String? = null
  var icmp_type: Int? = null
  var icmp_code: Int? = null
  var cidr_block: String? = null
 

}

class Egress(val action : String, val to_port : Int, val rule_no : Int, val protocol : String, val from_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_block: String? = null
  var icmp_type: Int? = null
  var icmp_code: Int? = null
  var cidr_block: String? = null
 

}
}
