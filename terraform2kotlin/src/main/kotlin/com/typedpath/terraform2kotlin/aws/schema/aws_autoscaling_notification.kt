package com.typedpath.terraform2kotlin.aws.schema

class aws_autoscaling_notification(val topic_arn : String, val group_names : List<String>, val notifications : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
