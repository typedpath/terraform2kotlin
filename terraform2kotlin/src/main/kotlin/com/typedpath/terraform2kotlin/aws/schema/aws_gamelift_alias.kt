package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_gamelift_alias(val routing_strategy : List<Routing_strategy>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
 


class Routing_strategy(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var fleet_id: String? = null
  var message: String? = null
 

enum class Type(val theValue: String ) {
	 SIMPLE ("SIMPLE"), TERMINAL ("TERMINAL") ;
	override fun toString() = theValue
	}
}
}
