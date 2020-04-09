package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_waf_web_acl(val name : String, val default_action : List<Default_action>, val metric_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var rules: List<Rules>? = null
  var tags: Map<String, String>? = null
  var logging_configuration: List<Logging_configuration>? = null
 


class Default_action(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Rules(val priority : Int, val rule_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
  var action: List<Action>? = null
  var override_action: List<Override_action>? = null
 

enum class Type(val theValue: String ) {
	 REGULAR ("REGULAR"), RATE_BASED ("RATE_BASED"), GROUP ("GROUP") ;
	override fun toString() = theValue
	}

class Override_action(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Action(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Logging_configuration(val log_destination : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var redacted_fields: List<Redacted_fields>? = null
 


class Redacted_fields(val field_to_match : List<Field_to_match>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
}
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
