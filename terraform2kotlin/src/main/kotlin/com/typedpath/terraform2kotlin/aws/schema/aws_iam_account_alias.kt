package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_account_alias(val account_alias : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

fun account_aliasRef(subPath: String = "") = ref(this, "account_alias", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
