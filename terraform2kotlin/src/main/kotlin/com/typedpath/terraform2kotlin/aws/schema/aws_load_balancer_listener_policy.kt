package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_load_balancer_listener_policy(val load_balancer_name : String, val load_balancer_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var policy_names: List<String>? = null
 

}
