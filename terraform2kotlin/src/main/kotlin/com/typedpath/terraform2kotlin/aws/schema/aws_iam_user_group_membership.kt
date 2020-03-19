package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_user_group_membership(val user : String, val groups : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
