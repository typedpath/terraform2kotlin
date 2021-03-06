package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_health_check(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var failure_threshold: Int? = null
  var port: Int? = null
  var measure_latency: Boolean? = null
  var child_healthchecks: List<String>? = null
  var enable_sni: Boolean? = null
  var resource_path: String? = null
  var search_string: String? = null
  var child_health_threshold: Int? = null
  var cloudwatch_alarm_region: String? = null
  var insufficient_data_health_status: String? = null
  var regions: List<String>? = null
  var ip_address: String? = null
  var tags: Map<String, String>? = null
  var request_interval: Int? = null
  var invert_healthcheck: Boolean? = null
  var cloudwatch_alarm_name: String? = null
  var reference_name: String? = null
  var fqdn: String? = null
 

enum class Type(val theValue: String ) {
	 CALCULATED ("CALCULATED"), CLOUDWATCH_METRIC ("CLOUDWATCH_METRIC"), HTTP ("HTTP"), HTTP_STR_MATCH ("HTTP_STR_MATCH"), HTTPS ("HTTPS"), HTTPS_STR_MATCH ("HTTPS_STR_MATCH"), TCP ("TCP") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
