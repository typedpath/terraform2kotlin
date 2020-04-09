package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_config_config_rule(val name : String, val source : List<Source>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var input_parameters: String? = null
  var maximum_execution_frequency: Maximum_execution_frequency? = null
  var scope: List<Scope>? = null
  var description: String? = null
  var tags: Map<String, String>? = null
 

enum class Maximum_execution_frequency(val theValue: String ) {
	 One_Hour ("One_Hour"), Three_Hours ("Three_Hours"), Six_Hours ("Six_Hours"), Twelve_Hours ("Twelve_Hours"), TwentyFour_Hours ("TwentyFour_Hours") ;
	override fun toString() = theValue
	}

class Source(val owner : Owner, val source_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var source_detail: List<Source_detail>? = null
 

enum class Owner(val theValue: String ) {
	 CUSTOM_LAMBDA ("CUSTOM_LAMBDA"), AWS ("AWS") ;
	override fun toString() = theValue
	}

class Source_detail() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var event_source: String? = null
  var maximum_execution_frequency: Maximum_execution_frequency? = null
  var message_type: String? = null
 

enum class Maximum_execution_frequency(val theValue: String ) {
	 One_Hour ("One_Hour"), Three_Hours ("Three_Hours"), Six_Hours ("Six_Hours"), Twelve_Hours ("Twelve_Hours"), TwentyFour_Hours ("TwentyFour_Hours") ;
	override fun toString() = theValue
	}
}
}

class Scope() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tag_key: String? = null
  var tag_value: String? = null
  var compliance_resource_id: String? = null
  var compliance_resource_types: List<String>? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
