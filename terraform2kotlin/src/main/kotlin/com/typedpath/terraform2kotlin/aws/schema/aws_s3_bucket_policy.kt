package com.typedpath.terraform2kotlin.aws.schema

class aws_s3_bucket_policy(val bucket : String, val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
