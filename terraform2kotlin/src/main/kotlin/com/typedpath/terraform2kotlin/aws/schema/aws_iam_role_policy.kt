package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_role_policy(val role : String, val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
 

}
