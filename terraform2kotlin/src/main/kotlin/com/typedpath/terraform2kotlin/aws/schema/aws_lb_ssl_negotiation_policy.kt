package com.typedpath.terraform2kotlin.aws.schema

class aws_lb_ssl_negotiation_policy(val lb_port : Int, val name : String, val load_balancer : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var attribute: List<Attribute>? = null
 


class Attribute(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}