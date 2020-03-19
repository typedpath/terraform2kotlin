package com.typedpath.terraform2kotlin.aws.schema

class aws_route53_resolver_rule(val domain_name : String, val rule_type : Rule_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var resolver_endpoint_id: String? = null
  var target_ip: List<Target_ip>? = null
  var tags: Map<String, String>? = null
 

enum class Rule_type(val theValue: String ) {
	 FORWARD ("FORWARD"), SYSTEM ("SYSTEM"), RECURSIVE ("RECURSIVE") ;
	override fun toString() = theValue
	}

class Target_ip(val ip : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var port: Int? = null
 

}
}
