package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_gateway_response(val rest_api_id : String, val response_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var response_parameters: Map<String, String>? = null
  var status_code: String? = null
  var response_templates: Map<String, String>? = null
 

}