package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_log_destination(val role_arn : String, val target_arn : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
