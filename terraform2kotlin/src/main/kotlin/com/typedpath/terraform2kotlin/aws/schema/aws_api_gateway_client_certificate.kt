package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_client_certificate() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
