package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_pinpoint_adm_channel(val application_id : String, val client_id : String, val client_secret : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
