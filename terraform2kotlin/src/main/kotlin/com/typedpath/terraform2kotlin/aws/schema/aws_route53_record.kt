package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_record(val name : String, val zone_id : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var alias: List<Alias>? = null
  var multivalue_answer_routing_policy: Boolean? = null
  var health_check_id: String? = null
  var weighted_routing_policy: List<Weighted_routing_policy>? = null
  var allow_overwrite: Boolean? = null
  var set_identifier: String? = null
  var geolocation_routing_policy: List<Geolocation_routing_policy>? = null
  var records: List<String>? = null
  var ttl: Int? = null
  var failover_routing_policy: List<Failover_routing_policy>? = null
  var latency_routing_policy: List<Latency_routing_policy>? = null
 

enum class Type(val theValue: String ) {
	 SOA ("SOA"), A ("A"), TXT ("TXT"), NS ("NS"), CNAME ("CNAME"), MX ("MX"), NAPTR ("NAPTR"), PTR ("PTR"), SRV ("SRV"), SPF ("SPF"), AAAA ("AAAA"), CAA ("CAA") ;
	override fun toString() = theValue
	}

class Alias(val zone_id : String, val name : String, val evaluate_target_health : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Weighted_routing_policy(val weight : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Geolocation_routing_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var continent: String? = null
  var country: String? = null
  var subdivision: String? = null
 

}

class Failover_routing_policy(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Latency_routing_policy(val region : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
