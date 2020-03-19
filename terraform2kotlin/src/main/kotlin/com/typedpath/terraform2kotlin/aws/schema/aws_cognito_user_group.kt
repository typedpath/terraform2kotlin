package com.typedpath.terraform2kotlin.aws.schema

class aws_cognito_user_group(val name : String, val user_pool_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var precedence: Int? = null
  var role_arn: String? = null
  var description: String? = null
 

}
