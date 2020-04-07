package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_security_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_id: String? = null
  var ingress: List<Ingress>? = null
  var egress: List<Egress>? = null
  var tags: Map<String, String>? = null
  var revoke_rules_on_delete: Boolean? = null
 


class Ingress(val protocol : String, val from_port : Int, val to_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
 

}

class Egress(val protocol : String, val to_port : Int, val from_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cidr_blocks: List<String>? = null
  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var security_groups: List<String>? = null
  var description: String? = null
  var self: Boolean? = null
 

}
}
