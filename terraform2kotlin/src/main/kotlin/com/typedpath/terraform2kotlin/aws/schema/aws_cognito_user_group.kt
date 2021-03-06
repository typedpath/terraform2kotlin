package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cognito_user_group(val name : String, val user_pool_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var role_arn: String? = null
  var description: String? = null
  var precedence: Int? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
