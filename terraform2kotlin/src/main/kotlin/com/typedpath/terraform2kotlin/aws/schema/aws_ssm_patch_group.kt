package com.typedpath.terraform2kotlin.aws.schema

class aws_ssm_patch_group(val baseline_id : String, val patch_group : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
