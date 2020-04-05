package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_xray_sampling_rule(val resource_arn : String, val priority : Int, val service_name : String, val url_path : String, val host : String, val http_method : String, val version : Int, val fixed_rate : Float, val reservoir_size : Int, val service_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var attributes: Map<String, String>? = null
  var rule_name: String? = null
 

}
