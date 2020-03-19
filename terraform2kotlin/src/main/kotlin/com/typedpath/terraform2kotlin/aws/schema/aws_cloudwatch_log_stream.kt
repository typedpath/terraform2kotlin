package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_log_stream(val log_group_name : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
