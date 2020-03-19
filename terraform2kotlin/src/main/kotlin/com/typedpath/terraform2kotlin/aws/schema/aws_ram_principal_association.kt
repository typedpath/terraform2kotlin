package com.typedpath.terraform2kotlin.aws.schema

class aws_ram_principal_association(val resource_share_arn : String, val principal : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
