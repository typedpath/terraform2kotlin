package com.typedpath.terraform2kotlin.aws.schema

class aws_pinpoint_baidu_channel(val application_id : String, val api_key : String, val secret_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
 

}