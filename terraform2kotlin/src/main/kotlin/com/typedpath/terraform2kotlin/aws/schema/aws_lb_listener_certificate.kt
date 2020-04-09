package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lb_listener_certificate(val listener_arn : String, val certificate_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
