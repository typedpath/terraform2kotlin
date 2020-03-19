package com.typedpath.terraform2kotlin.aws.schema

class aws_alb_listener_rule(val condition : List<Condition>, val listener_arn : String, val action : List<Action>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var priority: Int? = null
 


class Condition() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var http_request_method: List<Http_request_method>? = null
  var path_pattern: List<Path_pattern>? = null
  var query_string: List<Query_string>? = null
  var source_ip: List<Source_ip>? = null
  var values: List<String>? = null
  var field: Field? = null
  var host_header: List<Host_header>? = null
  var http_header: List<Http_header>? = null
 

enum class Field(val theValue: String ) {
	 host_header ("host-header"), path_pattern ("path-pattern") ;
	override fun toString() = theValue
	}

class Query_string(val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var key: String? = null
 

}

class Source_ip(val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Host_header() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var values: List<String>? = null
 

}

class Http_header(val http_header_name : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Http_request_method(val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Path_pattern() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var values: List<String>? = null
 

}
}

class Action(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var redirect: List<Redirect>? = null
  var fixed_response: List<Fixed_response>? = null
  var authenticate_cognito: List<Authenticate_cognito>? = null
  var authenticate_oidc: List<Authenticate_oidc>? = null
  var order: Int? = null
  var target_group_arn: String? = null
 

enum class Type(val theValue: String ) {
	 authenticate_cognito ("authenticate-cognito"), authenticate_oidc ("authenticate-oidc"), fixed_response ("fixed-response"), forward ("forward"), redirect ("redirect") ;
	override fun toString() = theValue
	}

class Redirect(val status_code : Status_code) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var protocol: Protocol? = null
  var query: String? = null
  var host: String? = null
  var path: String? = null
  var port: String? = null
 

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

class Authenticate_cognito(val user_pool_domain : String, val user_pool_arn : String, val user_pool_client_id : String) :  com.typedpath.terraform2kotlin.Resource() {
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

class Authenticate_oidc(val token_endpoint : String, val authorization_endpoint : String, val client_secret : String, val issuer : String, val client_id : String, val user_info_endpoint : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var session_cookie_name: String? = null
  var authentication_request_extra_params: Map<String, String>? = null
  var on_unauthenticated_request: On_unauthenticated_request? = null
  var scope: String? = null
  var session_timeout: Int? = null
 

enum class On_unauthenticated_request(val theValue: String ) {
	 deny ("deny"), allow ("allow"), authenticate ("authenticate") ;
	override fun toString() = theValue
	}
}
}
}
