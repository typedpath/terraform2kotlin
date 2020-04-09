package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_xray_sampling_rule(val priority : Int, val service_type : String, val http_method : String, val url_path : String, val resource_arn : String, val fixed_rate : Float, val reservoir_size : Int, val service_name : String, val host : String, val version : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var attributes: Map<String, String>? = null
  var rule_name: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
