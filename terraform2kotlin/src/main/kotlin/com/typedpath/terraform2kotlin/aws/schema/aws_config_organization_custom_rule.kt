package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_config_organization_custom_rule(val name : String, val trigger_types : List<Trigger_types>, val lambda_function_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var excluded_accounts: List<String>? = null
  var input_parameters: String? = null
  var resource_types_scope: List<String>? = null
  var tag_value_scope: String? = null
  var maximum_execution_frequency: Maximum_execution_frequency? = null
  var resource_id_scope: String? = null
  var tag_key_scope: String? = null
 

enum class Trigger_types(val theValue: String ) {
	 ConfigurationItemChangeNotification ("ConfigurationItemChangeNotification"), OversizedConfigurationItemChangeNotification ("OversizedConfigurationItemChangeNotification"), ScheduledNotification ("ScheduledNotification") ;
	override fun toString() = theValue
	}
enum class Maximum_execution_frequency(val theValue: String ) {
	 One_Hour ("One_Hour"), Three_Hours ("Three_Hours"), Six_Hours ("Six_Hours"), Twelve_Hours ("Twelve_Hours"), TwentyFour_Hours ("TwentyFour_Hours") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
