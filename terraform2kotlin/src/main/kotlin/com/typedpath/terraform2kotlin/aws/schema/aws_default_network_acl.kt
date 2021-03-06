package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_network_acl(val default_network_acl_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ingress: List<Ingress>? = null
  var egress: List<Egress>? = null
  var tags: Map<String, String>? = null
  var subnet_ids: List<String>? = null
 


class Ingress(val protocol : String, val rule_no : Int, val action : String, val from_port : Int, val to_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cidr_block: String? = null
  var icmp_type: Int? = null
  var icmp_code: Int? = null
  var ipv6_cidr_block: String? = null
 

}

class Egress(val protocol : String, val to_port : Int, val rule_no : Int, val from_port : Int, val action : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_block: String? = null
  var icmp_type: Int? = null
  var cidr_block: String? = null
  var icmp_code: Int? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
