package com.typedpath.terraform2kotlin.aws.schema

class aws_lb_cookie_stickiness_policy(val load_balancer : String, val lb_port : Int, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cookie_expiration_period: Int? = null
 

}
