package com.typedpath.terraform2kotlin.aws.schema

class aws_lightsail_static_ip_attachment(val static_ip_name : String, val instance_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
