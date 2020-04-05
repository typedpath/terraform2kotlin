package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_globalaccelerator_endpoint_group(val listener_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var health_check_interval_seconds: Int? = null
  var health_check_port: Int? = null
  var threshold_count: Int? = null
  var traffic_dial_percentage: Float? = null
  var endpoint_group_region: String? = null
  var health_check_path: String? = null
  var health_check_protocol: Health_check_protocol? = null
  var endpoint_configuration: List<Endpoint_configuration>? = null
 

enum class Health_check_protocol(val theValue: String ) {
	 TCP ("TCP"), HTTP ("HTTP"), HTTPS ("HTTPS") ;
	override fun toString() = theValue
	}

class Endpoint_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var endpoint_id: String? = null
  var weight: Int? = null
 

}
}
