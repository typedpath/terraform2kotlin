package com.typedpath.terraform2kotlin.aws.schema

class aws_xray_sampling_rule(val http_method : String, val version : Int, val priority : Int, val fixed_rate : Float, val service_name : String, val service_type : String, val host : String, val resource_arn : String, val reservoir_size : Int, val url_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var attributes: Map<String, String>? = null
  var rule_name: String? = null
 

}
