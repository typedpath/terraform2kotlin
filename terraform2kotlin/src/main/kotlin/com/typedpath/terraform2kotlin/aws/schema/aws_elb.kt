package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elb(val listener : List<Listener>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var connection_draining_timeout: Int? = null
  var health_check: List<Health_check>? = null
  var security_groups: List<String>? = null
  var source_security_group: String? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var internal: Boolean? = null
  var instances: List<String>? = null
  var connection_draining: Boolean? = null
  var name_prefix: String? = null
  var cross_zone_load_balancing: Boolean? = null
  var availability_zones: List<String>? = null
  var access_logs: List<Access_logs>? = null
  var subnets: List<String>? = null
  var idle_timeout: Int? = null
 


class Listener(val lb_port : Int, val lb_protocol : Lb_protocol, val instance_port : Int, val instance_protocol : Instance_protocol) :  com.typedpath.terraform2kotlin.Resource() {
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

class Health_check(val unhealthy_threshold : Int, val target : String, val interval : Int, val timeout : Int, val healthy_threshold : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Access_logs(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var interval: Int? = null
  var bucket_prefix: String? = null
 

}
fun connection_drainingRef(subPath: String = "") = ref(this, "connection_draining", subPath)
fun instancesRef(subPath: String = "") = ref(this, "instances", subPath)
fun listenerRef(subPath: String = "") = ref(this, "listener", subPath)
fun source_security_group_idRef(subPath: String = "") = ref(this, "source_security_group_id", subPath)
fun zone_idRef(subPath: String = "") = ref(this, "zone_id", subPath)
fun access_logsRef(subPath: String = "") = ref(this, "access_logs", subPath)
fun availability_zonesRef(subPath: String = "") = ref(this, "availability_zones", subPath)
fun dns_nameRef(subPath: String = "") = ref(this, "dns_name", subPath)
fun idle_timeoutRef(subPath: String = "") = ref(this, "idle_timeout", subPath)
fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun health_checkRef(subPath: String = "") = ref(this, "health_check", subPath)
fun internalRef(subPath: String = "") = ref(this, "internal", subPath)
fun subnetsRef(subPath: String = "") = ref(this, "subnets", subPath)
fun cross_zone_load_balancingRef(subPath: String = "") = ref(this, "cross_zone_load_balancing", subPath)
fun connection_draining_timeoutRef(subPath: String = "") = ref(this, "connection_draining_timeout", subPath)
fun source_security_groupRef(subPath: String = "") = ref(this, "source_security_group", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
