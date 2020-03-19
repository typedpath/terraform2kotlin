package com.typedpath.terraform2kotlin.aws.schema

class aws_ram_resource_association(val resource_arn : String, val resource_share_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
