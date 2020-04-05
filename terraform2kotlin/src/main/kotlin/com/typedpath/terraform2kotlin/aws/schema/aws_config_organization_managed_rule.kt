package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_config_organization_managed_rule(val rule_identifier : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var excluded_accounts: List<String>? = null
  var resource_types_scope: List<String>? = null
  var description: String? = null
  var input_parameters: String? = null
  var maximum_execution_frequency: Maximum_execution_frequency? = null
  var resource_id_scope: String? = null
  var tag_key_scope: String? = null
  var tag_value_scope: String? = null
 

enum class Maximum_execution_frequency(val theValue: String ) {
	 One_Hour ("One_Hour"), Three_Hours ("Three_Hours"), Six_Hours ("Six_Hours"), Twelve_Hours ("Twelve_Hours"), TwentyFour_Hours ("TwentyFour_Hours") ;
	override fun toString() = theValue
	}
}
