package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_media_convert_queue(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var pricing_plan: Pricing_plan? = null
  var reservation_plan_settings: List<Reservation_plan_settings>? = null
  var status: Status? = null
  var tags: Map<String, String>? = null
 

enum class Pricing_plan(val theValue: String ) {
	 ON_DEMAND ("ON_DEMAND"), RESERVED ("RESERVED") ;
	override fun toString() = theValue
	}
enum class Status(val theValue: String ) {
	 ACTIVE ("ACTIVE"), PAUSED ("PAUSED") ;
	override fun toString() = theValue
	}

class Reservation_plan_settings(val renewal_type : Renewal_type, val reserved_slots : Int, val commitment : Commitment) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Renewal_type(val theValue: String ) {
	 AUTO_RENEW ("AUTO_RENEW"), EXPIRE ("EXPIRE") ;
	override fun toString() = theValue
	}
enum class Commitment(val theValue: String ) {
	 ONE_YEAR ("ONE_YEAR") ;
	override fun toString() = theValue
	}
}
}
