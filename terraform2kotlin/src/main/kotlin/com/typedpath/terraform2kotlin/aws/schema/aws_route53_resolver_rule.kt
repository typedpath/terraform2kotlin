package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_resolver_rule(val rule_type : Rule_type, val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var resolver_endpoint_id: String? = null
  var target_ip: List<Target_ip>? = null
  var name: String? = null
  var tags: Map<String, String>? = null
 

enum class Rule_type(val theValue: String ) {
	 FORWARD ("FORWARD"), SYSTEM ("SYSTEM"), RECURSIVE ("RECURSIVE") ;
	override fun toString() = theValue
	}

class Target_ip(val ip : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var port: Int? = null
 

}
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun rule_typeRef(subPath: String = "") = ref(this, "rule_type", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun domain_nameRef(subPath: String = "") = ref(this, "domain_name", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun resolver_endpoint_idRef(subPath: String = "") = ref(this, "resolver_endpoint_id", subPath)
fun resolver_rule_idRef(subPath: String = "") = ref(this, "resolver_rule_id", subPath)
fun share_statusRef(subPath: String = "") = ref(this, "share_status", subPath)
}
