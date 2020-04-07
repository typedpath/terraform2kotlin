package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_xray_sampling_rule(val resource_arn : String, val reservoir_size : Int, val service_name : String, val http_method : String, val host : String, val url_path : String, val version : Int, val priority : Int, val fixed_rate : Float, val service_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var rule_name: String? = null
  var attributes: Map<String, String>? = null
 

}
