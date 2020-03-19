package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_event_permission(val statement_id : String, val principal : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var action: String? = null
  var condition: List<Condition>? = null
 


class Condition(val type : Type, val value : String, val key : Key) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 StringEquals ("StringEquals") ;
	override fun toString() = theValue
	}
enum class Key(val theValue: String ) {
	 aws_PrincipalOrgID ("aws:PrincipalOrgID") ;
	override fun toString() = theValue
	}
}
}
