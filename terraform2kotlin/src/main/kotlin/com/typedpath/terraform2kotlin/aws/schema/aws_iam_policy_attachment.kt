package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_policy_attachment(val name : String, val policy_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var users: List<String>? = null
  var roles: List<String>? = null
  var groups: List<String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
