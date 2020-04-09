package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_pinpoint_email_channel(val application_id : String, val from_address : String, val identity : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
