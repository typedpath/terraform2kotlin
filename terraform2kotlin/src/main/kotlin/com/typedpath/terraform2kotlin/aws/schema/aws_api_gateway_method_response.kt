package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_method_response(val rest_api_id : String, val resource_id : String, val http_method : Http_method, val status_code : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var response_models: Map<String, String>? = null
  var response_parameters: Map<String, String>? = null
  var response_parameters_in_json: String? = null
 

enum class Http_method(val theValue: String ) {
	 ANY ("ANY"), DELETE ("DELETE"), GET ("GET"), HEAD ("HEAD"), OPTIONS ("OPTIONS"), PATCH ("PATCH"), POST ("POST"), PUT ("PUT") ;
	override fun toString() = theValue
	}
}
