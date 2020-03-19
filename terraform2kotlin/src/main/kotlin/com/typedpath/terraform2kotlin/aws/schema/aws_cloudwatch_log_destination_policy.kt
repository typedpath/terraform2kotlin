package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_log_destination_policy(val destination_name : String, val access_policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
