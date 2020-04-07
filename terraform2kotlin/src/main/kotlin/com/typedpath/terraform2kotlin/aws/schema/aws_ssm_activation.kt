package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ssm_activation(val iam_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var expiration_date: String? = null
  var registration_limit: Int? = null
  var name: String? = null
  var description: String? = null
  var tags: Map<String, String>? = null
 

}
