package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lb_cookie_stickiness_policy(val name : String, val load_balancer : String, val lb_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cookie_expiration_period: Int? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
