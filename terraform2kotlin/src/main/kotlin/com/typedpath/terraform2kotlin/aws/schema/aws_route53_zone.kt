package com.typedpath.terraform2kotlin.aws.schema

class aws_route53_zone(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc: List<Vpc>? = null
  var vpc_id: String? = null
  var vpc_region: String? = null
  var tags: Map<String, String>? = null
  var comment: String? = null
  var delegation_set_id: String? = null
  var force_destroy: Boolean? = null
 


class Vpc(val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var vpc_region: String? = null
 

}
}
