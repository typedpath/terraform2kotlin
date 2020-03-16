package com.typedpath.terraform2kotlin.aws.schema

class aws_security_group() :  com.typedpath.terraform2kotlin.Resource() {
  var name: String? = null
  var vpc_id: String? = null
  var ingress: List<ingress>? = null
  var egress: List<egress>? = null
  var tags: Map<String, String>? = null
  var revoke_rules_on_delete: Boolean? = null
  var name_prefix: String? = null
  var description: String? = null

} 


class ingress(val from_port: Int, val to_port: Int, val protocol: String) :  com.typedpath.terraform2kotlin.Resource() {
  var cidr_blocks: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
  var prefix_list_ids: List<String>? = null
  var security_groups: List<String>? = null

} 


class egress(val from_port: Int, val to_port: Int, val protocol: String) :  com.typedpath.terraform2kotlin.Resource() {
  var self: Boolean? = null
  var cidr_blocks: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var security_groups: List<String>? = null
  var description: String? = null

} 

