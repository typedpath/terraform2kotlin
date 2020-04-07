package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_record(val type : Type, val zone_id : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var failover_routing_policy: List<Failover_routing_policy>? = null
  var latency_routing_policy: List<Latency_routing_policy>? = null
  var weighted_routing_policy: List<Weighted_routing_policy>? = null
  var records: List<String>? = null
  var allow_overwrite: Boolean? = null
  var ttl: Int? = null
  var set_identifier: String? = null
  var alias: List<Alias>? = null
  var geolocation_routing_policy: List<Geolocation_routing_policy>? = null
  var health_check_id: String? = null
  var multivalue_answer_routing_policy: Boolean? = null
 

enum class Type(val theValue: String ) {
	 SOA ("SOA"), A ("A"), TXT ("TXT"), NS ("NS"), CNAME ("CNAME"), MX ("MX"), NAPTR ("NAPTR"), PTR ("PTR"), SRV ("SRV"), SPF ("SPF"), AAAA ("AAAA"), CAA ("CAA") ;
	override fun toString() = theValue
	}

class Latency_routing_policy(val region : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Weighted_routing_policy(val weight : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Alias(val name : String, val evaluate_target_health : Boolean, val zone_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Geolocation_routing_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var subdivision: String? = null
  var continent: String? = null
  var country: String? = null
 

}

class Failover_routing_policy(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
