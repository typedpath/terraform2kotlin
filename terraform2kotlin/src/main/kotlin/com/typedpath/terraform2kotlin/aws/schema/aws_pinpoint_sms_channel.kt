package com.typedpath.terraform2kotlin.aws.schema

class aws_pinpoint_sms_channel(val application_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var short_code: String? = null
  var enabled: Boolean? = null
  var sender_id: String? = null
 

}
