package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_stage(val stage_name : String, val rest_api_id : String, val deployment_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cache_cluster_enabled: Boolean? = null
  var cache_cluster_size: Cache_cluster_size? = null
  var client_certificate_id: String? = null
  var variables: Map<String, String>? = null
  var tags: Map<String, String>? = null
  var xray_tracing_enabled: Boolean? = null
  var access_log_settings: List<Access_log_settings>? = null
  var documentation_version: String? = null
  var description: String? = null
 

enum class Cache_cluster_size(val theValue: String ) {
	 _0_5 ("0.5"), _1_6 ("1.6"), _6_1 ("6.1"), _118 ("118"), _13_5 ("13.5"), _237 ("237"), _28_4 ("28.4"), _58_2 ("58.2") ;
	override fun toString() = theValue
	}

class Access_log_settings(val destination_arn : String, val format : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
