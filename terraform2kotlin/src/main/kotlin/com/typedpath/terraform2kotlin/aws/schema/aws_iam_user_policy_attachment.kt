package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_user_policy_attachment(val user : String, val policy_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
