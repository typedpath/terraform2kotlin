package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_event_permission(val principal : String, val statement_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var action: String? = null
  var condition: List<Condition>? = null
 


class Condition(val key : Key, val type : Type, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Key(val theValue: String ) {
	 aws_PrincipalOrgID ("aws:PrincipalOrgID") ;
	override fun toString() = theValue
	}
enum class Type(val theValue: String ) {
	 StringEquals ("StringEquals") ;
	override fun toString() = theValue
	}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
