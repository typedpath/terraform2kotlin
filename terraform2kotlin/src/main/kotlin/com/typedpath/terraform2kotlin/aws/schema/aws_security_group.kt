package com.typedpath.terraform2kotlin.aws.schema

class aws_security_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var egress: List<Egress>? = null
  var tags: Map<String, String>? = null
  var revoke_rules_on_delete: Boolean? = null
  var name: String? = null
  var description: String? = null
  var vpc_id: String? = null
  var ingress: List<Ingress>? = null
 


class Egress(val from_port : Int, val protocol : String, val to_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var self: Boolean? = null
 

}

class Ingress(val to_port : Int, val protocol : String, val from_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix_list_ids: List<String>? = null
  var self: Boolean? = null
  var cidr_blocks: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null
  var description: String? = null
 

}
}
