package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ebs_default_kms_key(val key_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

fun key_arnRef(subPath: String = "") = ref(this, "key_arn", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
