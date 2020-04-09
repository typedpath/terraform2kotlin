package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_delegation_set() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var reference_name: String? = null
 

fun caller_referenceRef(subPath: String = "") = ref(this, "caller_reference", subPath)
fun name_serversRef(subPath: String = "") = ref(this, "name_servers", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
