package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_user_group_membership(val user : String, val groups : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
