package com.typedpath.terraform2kotlin.aws.schema

class aws_storagegateway_cache(val gateway_arn : String, val disk_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
