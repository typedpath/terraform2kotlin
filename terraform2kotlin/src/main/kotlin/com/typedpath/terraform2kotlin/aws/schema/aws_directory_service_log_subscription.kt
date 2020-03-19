package com.typedpath.terraform2kotlin.aws.schema

class aws_directory_service_log_subscription(val log_group_name : String, val directory_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
