package com.typedpath.terraform2kotlin.aws.schema

class aws_sfn_state_machine(val definition : String, val name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
