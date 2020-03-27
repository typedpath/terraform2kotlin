package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_security_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ingress: List<Ingress>? = null
  var egress: List<Egress>? = null
  var tags: Map<String, String>? = null
  var vpc_id: String? = null
  var revoke_rules_on_delete: Boolean? = null
 


class Egress(val to_port : Int, val protocol : String, val from_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var security_groups: List<String>? = null
  var cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
  var ipv6_cidr_blocks: List<String>? = null
 

}

class Ingress(val from_port : Int, val to_port : Int, val protocol : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
 

}
}
