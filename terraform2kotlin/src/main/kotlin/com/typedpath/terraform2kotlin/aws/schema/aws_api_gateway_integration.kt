package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_integration(val http_method : Http_method, val resource_id : String, val type : Type, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var passthrough_behavior: Passthrough_behavior? = null
  var cache_key_parameters: List<String>? = null
  var connection_id: String? = null
  var content_handling: Content_handling? = null
  var request_parameters: Map<String, String>? = null
  var request_parameters_in_json: String? = null
  var timeout_milliseconds: Int? = null
  var connection_type: Connection_type? = null
  var credentials: String? = null
  var cache_namespace: String? = null
  var uri: String? = null
  var integration_http_method: Integration_http_method? = null
  var request_templates: Map<String, String>? = null
 

enum class Http_method(val theValue: String ) {
	 ANY ("ANY"), DELETE ("DELETE"), GET ("GET"), HEAD ("HEAD"), OPTIONS ("OPTIONS"), PATCH ("PATCH"), POST ("POST"), PUT ("PUT") ;
	override fun toString() = theValue
	}
enum class Type(val theValue: String ) {
	 HTTP ("HTTP"), AWS ("AWS"), MOCK ("MOCK"), HTTP_PROXY ("HTTP_PROXY"), AWS_PROXY ("AWS_PROXY") ;
	override fun toString() = theValue
	}
enum class Passthrough_behavior(val theValue: String ) {
	 WHEN_NO_MATCH ("WHEN_NO_MATCH"), WHEN_NO_TEMPLATES ("WHEN_NO_TEMPLATES"), NEVER ("NEVER") ;
	override fun toString() = theValue
	}
enum class Content_handling(val theValue: String ) {
	 CONVERT_TO_BINARY ("CONVERT_TO_BINARY"), CONVERT_TO_TEXT ("CONVERT_TO_TEXT") ;
	override fun toString() = theValue
	}
enum class Connection_type(val theValue: String ) {
	 INTERNET ("INTERNET"), VPC_LINK ("VPC_LINK") ;
	override fun toString() = theValue
	}
enum class Integration_http_method(val theValue: String ) {
	 ANY ("ANY"), DELETE ("DELETE"), GET ("GET"), HEAD ("HEAD"), OPTIONS ("OPTIONS"), PATCH ("PATCH"), POST ("POST"), PUT ("PUT") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
