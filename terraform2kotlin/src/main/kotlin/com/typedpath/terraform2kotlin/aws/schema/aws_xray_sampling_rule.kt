package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_xray_sampling_rule(val priority : Int, val reservoir_size : Int, val version : Int, val resource_arn : String, val fixed_rate : Float, val service_name : String, val service_type : String, val host : String, val http_method : String, val url_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var rule_name: String? = null
  var attributes: Map<String, String>? = null
 

}
