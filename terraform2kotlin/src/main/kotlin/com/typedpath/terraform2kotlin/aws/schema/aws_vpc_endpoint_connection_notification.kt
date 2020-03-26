package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpc_endpoint_connection_notification(val connection_notification_arn : String, val connection_events : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_endpoint_service_id: String? = null
  var vpc_endpoint_id: String? = null
 

}
