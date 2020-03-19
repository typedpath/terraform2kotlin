package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_policy_attachment(val policy_arn : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var users: List<String>? = null
  var roles: List<String>? = null
  var groups: List<String>? = null
 

}
