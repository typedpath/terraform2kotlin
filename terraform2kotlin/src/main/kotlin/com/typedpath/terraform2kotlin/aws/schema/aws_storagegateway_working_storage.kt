package com.typedpath.terraform2kotlin.aws.schema

class aws_storagegateway_working_storage(val disk_id : String, val gateway_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}