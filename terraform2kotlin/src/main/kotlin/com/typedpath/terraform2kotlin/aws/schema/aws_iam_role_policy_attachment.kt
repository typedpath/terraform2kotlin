package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_role_policy_attachment(val role: String, val policy_arn: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	
} 

