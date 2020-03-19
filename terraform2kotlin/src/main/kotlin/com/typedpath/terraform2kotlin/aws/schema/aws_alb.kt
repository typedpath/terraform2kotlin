package com.typedpath.terraform2kotlin.aws.schema

class aws_alb() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var internal: Boolean? = null
  var subnet_mapping: List<Subnet_mapping>? = null
  var name_prefix: String? = null
  var load_balancer_type: Load_balancer_type? = null
  var enable_deletion_protection: Boolean? = null
  var security_groups: List<String>? = null
  var access_logs: List<Access_logs>? = null
  var enable_cross_zone_load_balancing: Boolean? = null
  var ip_address_type: Ip_address_type? = null
  var subnets: List<String>? = null
  var idle_timeout: Int? = null
  var enable_http2: Boolean? = null
  var tags: Map<String, String>? = null
 

enum class Load_balancer_type(val theValue: String ) {
	 application ("application"), network ("network") ;
	override fun toString() = theValue
	}
enum class Ip_address_type(val theValue: String ) {
	 ipv4 ("ipv4"), dualstack ("dualstack") ;
	override fun toString() = theValue
	}

class Subnet_mapping(val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var allocation_id: String? = null
 

}

class Access_logs(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var enabled: Boolean? = null
 

}
}
