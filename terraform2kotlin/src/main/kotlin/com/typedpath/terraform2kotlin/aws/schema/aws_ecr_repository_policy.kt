package com.typedpath.terraform2kotlin.aws.schema

class aws_ecr_repository_policy(val repository : String, val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
