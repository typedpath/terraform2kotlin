package com.typedpath.terraform2kotlin.aws.schema

class aws_security_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ingress: List<ingress>? = null
  var egress: List<egress>? = null
  var vpc_id: String? = null
  var name_prefix: String? = null
  var description: String? = null
  var tags: Map<String, String>? = null
  var revoke_rules_on_delete: Boolean? = null
  var name: String? = null

} 


class ingress(val protocol: String, val from_port: Int, val to_port: Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var security_groups: List<String>? = null
  var cidr_blocks: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var self: Boolean? = null
  var description: String? = null

} 


class egress(val protocol: String, val from_port: Int, val to_port: Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null

} 

