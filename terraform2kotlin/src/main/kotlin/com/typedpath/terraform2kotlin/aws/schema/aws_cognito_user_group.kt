package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cognito_user_group(val user_pool_id : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var precedence: Int? = null
  var role_arn: String? = null
 

}
