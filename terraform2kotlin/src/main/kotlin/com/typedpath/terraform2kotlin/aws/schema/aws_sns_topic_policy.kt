package com.typedpath.terraform2kotlin.aws.schema

class aws_sns_topic_policy(val arn : String, val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
