package com.typedpath.terraform2kotlin.aws.schema

class aws_lb_listener(val default_action : List<Default_action>, val load_balancer_arn : String, val port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var protocol: Protocol? = null
  var ssl_policy: String? = null
  var certificate_arn: String? = null
 

enum class Protocol(val theValue: String ) {
	 HTTP ("HTTP"), HTTPS ("HTTPS"), TCP ("TCP"), TLS ("TLS"), UDP ("UDP"), TCP_UDP ("TCP_UDP") ;
	override fun toString() = theValue
	}

class Default_action(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var target_group_arn: String? = null
  var redirect: List<Redirect>? = null
  var fixed_response: List<Fixed_response>? = null
  var authenticate_cognito: List<Authenticate_cognito>? = null
  var authenticate_oidc: List<Authenticate_oidc>? = null
  var order: Int? = null
 

enum class Type(val theValue: String ) {
	 authenticate_cognito ("authenticate-cognito"), authenticate_oidc ("authenticate-oidc"), fixed_response ("fixed-response"), forward ("forward"), redirect ("redirect") ;
	override fun toString() = theValue
	}

class Redirect(val status_code : Status_code) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var port: String? = null
  var protocol: Protocol? = null
  var query: String? = null
  var host: String? = null
  var path: String? = null
 

enum class Status_code(val theValue: String ) {
	 HTTP_301 ("HTTP_301"), HTTP_302 ("HTTP_302") ;
	override fun toString() = theValue
	}
enum class Protocol(val theValue: String ) {
	 __protocol_ ("#{protocol}"), HTTP ("HTTP"), HTTPS ("HTTPS") ;
	override fun toString() = theValue
	}
}

class Fixed_response(val content_type : Content_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var message_body: String? = null
  var status_code: String? = null
 

enum class Content_type(val theValue: String ) {
	 text_plain ("text/plain"), text_css ("text/css"), text_html ("text/html"), application_javascript ("application/javascript"), application_json ("application/json") ;
	override fun toString() = theValue
	}
}

class Authenticate_cognito(val user_pool_arn : String, val user_pool_client_id : String, val user_pool_domain : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var authentication_request_extra_params: Map<String, String>? = null
  var on_unauthenticated_request: On_unauthenticated_request? = null
  var scope: String? = null
  var session_cookie_name: String? = null
  var session_timeout: Int? = null
 

enum class On_unauthenticated_request(val theValue: String ) {
	 deny ("deny"), allow ("allow"), authenticate ("authenticate") ;
	override fun toString() = theValue
	}
}

class Authenticate_oidc(val client_id : String, val issuer : String, val authorization_endpoint : String, val client_secret : String, val token_endpoint : String, val user_info_endpoint : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var authentication_request_extra_params: Map<String, String>? = null
  var on_unauthenticated_request: On_unauthenticated_request? = null
  var session_timeout: Int? = null
  var scope: String? = null
  var session_cookie_name: String? = null
 

enum class On_unauthenticated_request(val theValue: String ) {
	 deny ("deny"), allow ("allow"), authenticate ("authenticate") ;
	override fun toString() = theValue
	}
}
}
}