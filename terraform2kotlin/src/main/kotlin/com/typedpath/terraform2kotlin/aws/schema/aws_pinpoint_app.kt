package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_pinpoint_app() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var campaign_hook: List<Campaign_hook>? = null
  var limits: List<Limits>? = null
  var quiet_time: List<Quiet_time>? = null
  var tags: Map<String, String>? = null
  var name: String? = null
 


class Campaign_hook() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var lambda_function_name: String? = null
  var mode: Mode? = null
  var web_url: String? = null
 

enum class Mode(val theValue: String ) {
	 DELIVERY ("DELIVERY"), FILTER ("FILTER") ;
	override fun toString() = theValue
	}
}

class Limits() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var daily: Int? = null
  var maximum_duration: Int? = null
  var messages_per_second: Int? = null
  var total: Int? = null
 

}

class Quiet_time() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var end: String? = null
  var start: String? = null
 

}
}
