package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_method_settings(val rest_api_id : String, val stage_name : String, val method_path : String, val settings : List<Settings>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Settings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var throttling_rate_limit: Float? = null
  var cache_ttl_in_seconds: Int? = null
  var cache_data_encrypted: Boolean? = null
  var require_authorization_for_cache_control: Boolean? = null
  var logging_level: String? = null
  var data_trace_enabled: Boolean? = null
  var caching_enabled: Boolean? = null
  var unauthorized_cache_control_header_strategy: String? = null
  var metrics_enabled: Boolean? = null
  var throttling_burst_limit: Int? = null
 

}
}