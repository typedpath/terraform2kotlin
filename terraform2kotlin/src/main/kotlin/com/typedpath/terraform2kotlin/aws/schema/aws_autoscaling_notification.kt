package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_autoscaling_notification(val notifications : List<String>, val topic_arn : String, val group_names : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
