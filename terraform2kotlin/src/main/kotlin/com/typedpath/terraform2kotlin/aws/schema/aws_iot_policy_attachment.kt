package com.typedpath.terraform2kotlin.aws.schema

class aws_iot_policy_attachment(val policy : String, val target : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
