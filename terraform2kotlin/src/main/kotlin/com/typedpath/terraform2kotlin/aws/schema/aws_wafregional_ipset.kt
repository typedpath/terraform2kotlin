package com.typedpath.terraform2kotlin.aws.schema

class aws_wafregional_ipset(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ip_set_descriptor: List<Ip_set_descriptor>? = null
 


class Ip_set_descriptor(val type : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
