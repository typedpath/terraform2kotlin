package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_security_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var revoke_rules_on_delete: Boolean? = null
  var vpc_id: String? = null
  var ingress: List<Ingress>? = null
  var egress: List<Egress>? = null
 


class Ingress(val from_port : Int, val to_port : Int, val protocol : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var self: Boolean? = null
  var ipv6_cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
 

}

class Egress(val from_port : Int, val to_port : Int, val protocol : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var self: Boolean? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var security_groups: List<String>? = null
 

}
}
