package com.typedpath.terraform2kotlin.aws.schema

class aws_sqs_queue_policy(val queue_url : String, val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
