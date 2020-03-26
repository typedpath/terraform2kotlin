package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_method(val resource_id : String, val authorization : String, val rest_api_id : String, val http_method : Http_method) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var request_parameters_in_json: String? = null
  var authorizer_id: String? = null
  var authorization_scopes: List<String>? = null
  var api_key_required: Boolean? = null
  var request_models: Map<String, String>? = null
  var request_parameters: Map<String, String>? = null
  var request_validator_id: String? = null
 

enum class Http_method(val theValue: String ) {
	 ANY ("ANY"), DELETE ("DELETE"), GET ("GET"), HEAD ("HEAD"), OPTIONS ("OPTIONS"), PATCH ("PATCH"), POST ("POST"), PUT ("PUT") ;
	override fun toString() = theValue
	}
}
