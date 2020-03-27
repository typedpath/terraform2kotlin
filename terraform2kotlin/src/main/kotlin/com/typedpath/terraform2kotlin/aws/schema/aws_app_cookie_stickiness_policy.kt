package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_app_cookie_stickiness_policy(val lb_port : Int, val cookie_name : String, val name : String, val load_balancer : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
