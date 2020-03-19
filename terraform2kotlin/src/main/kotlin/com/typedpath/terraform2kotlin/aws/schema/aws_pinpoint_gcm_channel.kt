package com.typedpath.terraform2kotlin.aws.schema

class aws_pinpoint_gcm_channel(val api_key : String, val application_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
 

}
