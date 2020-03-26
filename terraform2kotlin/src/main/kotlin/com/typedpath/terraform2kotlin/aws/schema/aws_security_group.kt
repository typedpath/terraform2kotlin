package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_security_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
  var egress: List<Egress>? = null
  var vpc_id: String? = null
  var ingress: List<Ingress>? = null
  var revoke_rules_on_delete: Boolean? = null
  var name: String? = null
  var name_prefix: String? = null
 


class Egress(val to_port : Int, val protocol : String, val from_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_blocks: List<String>? = null
  var security_groups: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
 

}

class Ingress(val protocol : String, val from_port : Int, val to_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var security_groups: List<String>? = null
  var self: Boolean? = null
  var description: String? = null
  var cidr_blocks: List<String>? = null
 

}
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
