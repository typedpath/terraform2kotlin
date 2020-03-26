package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_security_group_rule(val type : Type, val security_group_id : String, val from_port : Int, val to_port : Int, val protocol : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var cidr_blocks: List<String>? = null
  var self: Boolean? = null
  var ipv6_cidr_blocks: List<String>? = null
  var prefix_list_ids: List<String>? = null
  var source_security_group_id: String? = null
 

enum class Type(val theValue: String ) {
	 ingress ("ingress"), egress ("egress") ;
	override fun toString() = theValue
	}
}
