package com.typedpath.terraform2kotlin.aws.schema

class aws_lambda_alias(val function_name : String, val function_version : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var routing_config: List<Routing_config>? = null
  var description: String? = null
 


class Routing_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var additional_version_weights: Map<String, String>? = null
 

}
}
