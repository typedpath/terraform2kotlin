package com.typedpath.terraform2kotlin.aws.schema

class aws_lb_target_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var lambda_multi_value_headers_enabled: Boolean? = null
  var load_balancing_algorithm_type: Load_balancing_algorithm_type? = null
  var stickiness: List<Stickiness>? = null
  var tags: Map<String, String>? = null
  var slow_start: Int? = null
  var protocol: Protocol? = null
  var deregistration_delay: Int? = null
  var proxy_protocol_v2: Boolean? = null
  var port: Int? = null
  var name: String? = null
  var health_check: List<Health_check>? = null
  var target_type: Target_type? = null
  var name_prefix: String? = null
  var vpc_id: String? = null
 

enum class Load_balancing_algorithm_type(val theValue: String ) {
	 round_robin ("round_robin"), least_outstanding_requests ("least_outstanding_requests") ;
	override fun toString() = theValue
	}
enum class Protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), TCP ("TCP"), TLS ("TLS"), UDP ("UDP"), TCP_UDP ("TCP_UDP") ;
	override fun toString() = theValue
	}
enum class Target_type(val theValue: String ) {
	 instance ("instance"), ip ("ip"), lambda ("lambda") ;
	override fun toString() = theValue
	}

class Health_check() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var port: String? = null
  var protocol: Protocol? = null
  var healthy_threshold: Int? = null
  var unhealthy_threshold: Int? = null
  var enabled: Boolean? = null
  var interval: Int? = null
  var path: String? = null
  var timeout: Int? = null
  var matcher: String? = null
 

enum class Protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), TCP ("TCP") ;
	override fun toString() = theValue
	}
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
}