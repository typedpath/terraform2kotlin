package com.typedpath.terraform2kotlin.aws.schema

class aws_elb(val listener : List<Listener>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var source_security_group: String? = null
  var connection_draining_timeout: Int? = null
  var tags: Map<String, String>? = null
  var internal: Boolean? = null
  var cross_zone_load_balancing: Boolean? = null
  var availability_zones: List<String>? = null
  var security_groups: List<String>? = null
  var subnets: List<String>? = null
  var name: String? = null
  var instances: List<String>? = null
  var connection_draining: Boolean? = null
  var access_logs: List<Access_logs>? = null
  var health_check: List<Health_check>? = null
  var name_prefix: String? = null
  var idle_timeout: Int? = null
 


class Listener(val lb_protocol : Lb_protocol, val instance_port : Int, val instance_protocol : Instance_protocol, val lb_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ssl_certificate_id: String? = null
 

enum class Lb_protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), SSL ("SSL"), TCP ("TCP") ;
	override fun toString() = theValue
	}
enum class Instance_protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), SSL ("SSL"), TCP ("TCP") ;
	override fun toString() = theValue
	}
}

class Access_logs(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_prefix: String? = null
  var enabled: Boolean? = null
  var interval: Int? = null
 

}

class Health_check(val healthy_threshold : Int, val unhealthy_threshold : Int, val target : String, val interval : Int, val timeout : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
