package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_role_policy(val policy: String, val role: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var name: String? = null

} 

