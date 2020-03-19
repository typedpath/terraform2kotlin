package com.typedpath.terraform2kotlin.aws.schema

class aws_ssm_activation(val iam_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var registration_limit: Int? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var description: String? = null
  var expiration_date: String? = null
 

}
