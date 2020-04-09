package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_certificate(val active : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var csr: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
