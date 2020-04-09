package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_service_discovery_service(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var namespace_id: String? = null
  var dns_config: List<Dns_config>? = null
  var health_check_config: List<Health_check_config>? = null
  var health_check_custom_config: List<Health_check_custom_config>? = null
  var description: String? = null
 


class Dns_config(val namespace_id : String, val dns_records : List<Dns_records>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var routing_policy: Routing_policy? = null
 

enum class Routing_policy(val theValue: String ) {
	 MULTIVALUE ("MULTIVALUE"), WEIGHTED ("WEIGHTED") ;
	override fun toString() = theValue
	}

class Dns_records(val ttl : Int, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 SRV ("SRV"), A ("A"), AAAA ("AAAA"), CNAME ("CNAME") ;
	override fun toString() = theValue
	}
}
}

class Health_check_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var failure_threshold: Int? = null
  var resource_path: String? = null
  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), TCP ("TCP") ;
	override fun toString() = theValue
	}
}

class Health_check_custom_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var failure_threshold: Int? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
