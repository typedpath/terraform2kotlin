package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_method_settings(val settings : List<Settings>, val rest_api_id : String, val stage_name : String, val method_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Settings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var logging_level: String? = null
  var throttling_rate_limit: Float? = null
  var caching_enabled: Boolean? = null
  var require_authorization_for_cache_control: Boolean? = null
  var unauthorized_cache_control_header_strategy: String? = null
  var metrics_enabled: Boolean? = null
  var data_trace_enabled: Boolean? = null
  var throttling_burst_limit: Int? = null
  var cache_ttl_in_seconds: Int? = null
  var cache_data_encrypted: Boolean? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
