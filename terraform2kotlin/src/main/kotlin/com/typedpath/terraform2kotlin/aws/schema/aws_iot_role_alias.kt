package com.typedpath.terraform2kotlin.aws.schema

class aws_iot_role_alias(val alias : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var credential_duration: Int? = null
 

}
