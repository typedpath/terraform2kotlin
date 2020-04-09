package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elb_service_account() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="data"
	  var region: String? = null
 

fun regionRef(subPath: String = "") = ref(this, "region", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
