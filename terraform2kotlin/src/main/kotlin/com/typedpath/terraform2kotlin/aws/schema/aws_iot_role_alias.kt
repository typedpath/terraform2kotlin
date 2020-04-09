package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_role_alias(val alias : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var credential_duration: Int? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
