package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_group_policy(val policy : String, val group : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
