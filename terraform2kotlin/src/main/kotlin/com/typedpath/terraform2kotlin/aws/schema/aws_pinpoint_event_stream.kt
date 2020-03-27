package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_pinpoint_event_stream(val destination_stream_arn : String, val role_arn : String, val application_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
