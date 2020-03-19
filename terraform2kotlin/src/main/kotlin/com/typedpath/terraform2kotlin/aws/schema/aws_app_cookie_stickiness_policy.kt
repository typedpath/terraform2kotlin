package com.typedpath.terraform2kotlin.aws.schema

class aws_app_cookie_stickiness_policy(val cookie_name : String, val name : String, val load_balancer : String, val lb_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
