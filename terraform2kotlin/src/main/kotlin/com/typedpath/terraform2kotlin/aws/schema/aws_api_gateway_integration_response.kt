package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_integration_response(val rest_api_id : String, val resource_id : String, val status_code : String, val http_method : Http_method) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var selection_pattern: String? = null
  var response_templates: Map<String, String>? = null
  var response_parameters: Map<String, String>? = null
  var response_parameters_in_json: String? = null
  var content_handling: Content_handling? = null
 

enum class Http_method(val theValue: String ) {
	 ANY ("ANY"), DELETE ("DELETE"), GET ("GET"), HEAD ("HEAD"), OPTIONS ("OPTIONS"), PATCH ("PATCH"), POST ("POST"), PUT ("PUT") ;
	override fun toString() = theValue
	}
enum class Content_handling(val theValue: String ) {
	 CONVERT_TO_BINARY ("CONVERT_TO_BINARY"), CONVERT_TO_TEXT ("CONVERT_TO_TEXT") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
