package com.typedpath.terraform2kotlin.aws.schema

class aws_ses_identity_policy(val policy : String, val identity : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
