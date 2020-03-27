package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lb_cookie_stickiness_policy(val lb_port : Int, val name : String, val load_balancer : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cookie_expiration_period: Int? = null
 

}
