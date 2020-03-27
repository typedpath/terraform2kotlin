package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_alb() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var internal: Boolean? = null
  var subnets: List<String>? = null
  var subnet_mapping: List<Subnet_mapping>? = null
  var idle_timeout: Int? = null
  var enable_http2: Boolean? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var load_balancer_type: Load_balancer_type? = null
  var security_groups: List<String>? = null
  var access_logs: List<Access_logs>? = null
  var enable_deletion_protection: Boolean? = null
  var ip_address_type: Ip_address_type? = null
  var enable_cross_zone_load_balancing: Boolean? = null
 

enum class Ip_address_type(val theValue: String ) {
	 ipv4 ("ipv4"), dualstack ("dualstack") ;
	override fun toString() = theValue
	}
enum class Load_balancer_type(val theValue: String ) {
	 application ("application"), network ("network") ;
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
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun enable_deletion_protectionRef(subPath: String = "") = ref(this, "enable_deletion_protection", subPath)
fun idle_timeoutRef(subPath: String = "") = ref(this, "idle_timeout", subPath)
fun zone_idRef(subPath: String = "") = ref(this, "zone_id", subPath)
fun dns_nameRef(subPath: String = "") = ref(this, "dns_name", subPath)
fun internalRef(subPath: String = "") = ref(this, "internal", subPath)
fun subnetsRef(subPath: String = "") = ref(this, "subnets", subPath)
fun subnet_mappingRef(subPath: String = "") = ref(this, "subnet_mapping", subPath)
fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun arn_suffixRef(subPath: String = "") = ref(this, "arn_suffix", subPath)
fun load_balancer_typeRef(subPath: String = "") = ref(this, "load_balancer_type", subPath)
fun access_logsRef(subPath: String = "") = ref(this, "access_logs", subPath)
}
