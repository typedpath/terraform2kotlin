package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_resolver_endpoint(val direction : Direction, val ip_address : List<Ip_address>, val security_group_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var name: String? = null
 

enum class Direction(val theValue: String ) {
	 INBOUND ("INBOUND"), OUTBOUND ("OUTBOUND") ;
	override fun toString() = theValue
	}

class Ip_address(val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ip: String? = null
 

}
}
