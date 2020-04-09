package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_alb_target_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var port: Int? = null
  var vpc_id: String? = null
  var deregistration_delay: Int? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var slow_start: Int? = null
  var lambda_multi_value_headers_enabled: Boolean? = null
  var stickiness: List<Stickiness>? = null
  var name_prefix: String? = null
  var proxy_protocol_v2: Boolean? = null
  var health_check: List<Health_check>? = null
  var protocol: Protocol? = null
  var target_type: Target_type? = null
  var load_balancing_algorithm_type: Load_balancing_algorithm_type? = null
 

enum class Protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), TCP ("TCP"), TLS ("TLS"), UDP ("UDP"), TCP_UDP ("TCP_UDP") ;
	override fun toString() = theValue
	}
enum class Target_type(val theValue: String ) {
	 instance ("instance"), ip ("ip"), lambda ("lambda") ;
	override fun toString() = theValue
	}
enum class Load_balancing_algorithm_type(val theValue: String ) {
	 round_robin ("round_robin"), least_outstanding_requests ("least_outstanding_requests") ;
	override fun toString() = theValue
	}

class Stickiness(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var cookie_duration: Int? = null
 

enum class Type(val theValue: String ) {
	 lb_cookie ("lb_cookie") ;
	override fun toString() = theValue
	}
}

class Health_check() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var port: String? = null
  var timeout: Int? = null
  var unhealthy_threshold: Int? = null
  var enabled: Boolean? = null
  var interval: Int? = null
  var path: String? = null
  var protocol: Protocol? = null
  var healthy_threshold: Int? = null
  var matcher: String? = null
 

enum class Protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), TCP ("TCP") ;
	override fun toString() = theValue
	}
}
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun stickinessRef(subPath: String = "") = ref(this, "stickiness", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun deregistration_delayRef(subPath: String = "") = ref(this, "deregistration_delay", subPath)
fun lambda_multi_value_headers_enabledRef(subPath: String = "") = ref(this, "lambda_multi_value_headers_enabled", subPath)
fun health_checkRef(subPath: String = "") = ref(this, "health_check", subPath)
fun arn_suffixRef(subPath: String = "") = ref(this, "arn_suffix", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun slow_startRef(subPath: String = "") = ref(this, "slow_start", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun protocolRef(subPath: String = "") = ref(this, "protocol", subPath)
fun proxy_protocol_v2Ref(subPath: String = "") = ref(this, "proxy_protocol_v2", subPath)
fun target_typeRef(subPath: String = "") = ref(this, "target_type", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
