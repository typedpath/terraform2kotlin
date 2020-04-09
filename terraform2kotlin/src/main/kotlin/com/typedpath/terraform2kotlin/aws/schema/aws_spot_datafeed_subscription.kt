package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_spot_datafeed_subscription(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var prefix: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
