package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_alb_listener_certificate(val certificate_arn : String, val listener_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
