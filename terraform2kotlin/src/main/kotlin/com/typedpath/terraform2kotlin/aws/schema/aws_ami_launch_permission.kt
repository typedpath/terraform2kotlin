package com.typedpath.terraform2kotlin.aws.schema

class aws_ami_launch_permission(val image_id : String, val account_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
