package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_service_discovery_private_dns_namespace(val name : String, val vpc : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
