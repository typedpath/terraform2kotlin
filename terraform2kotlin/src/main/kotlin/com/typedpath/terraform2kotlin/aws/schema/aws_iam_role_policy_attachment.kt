package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_role_policy_attachment(val policy_arn : String, val role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
