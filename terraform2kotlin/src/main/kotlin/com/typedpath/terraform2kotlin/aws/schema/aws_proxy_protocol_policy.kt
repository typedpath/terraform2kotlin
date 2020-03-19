package com.typedpath.terraform2kotlin.aws.schema

class aws_proxy_protocol_policy(val load_balancer : String, val instance_ports : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
