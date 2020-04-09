package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_alb_listener_rule(val listener_arn : String, val action : List<Action>, val condition : List<Condition>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var priority: Int? = null
 


class Action(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var order: Int? = null
  var target_group_arn: String? = null
  var redirect: List<Redirect>? = null
  var fixed_response: List<Fixed_response>? = null
  var authenticate_cognito: List<Authenticate_cognito>? = null
  var authenticate_oidc: List<Authenticate_oidc>? = null
 

enum class Type(val theValue: String ) {
	 authenticate_cognito ("authenticate-cognito"), authenticate_oidc ("authenticate-oidc"), fixed_response ("fixed-response"), forward ("forward"), redirect ("redirect") ;
	override fun toString() = theValue
	}

class Authenticate_oidc(val authorization_endpoint : String, val client_id : String, val token_endpoint : String, val user_info_endpoint : String, val client_secret : String, val issuer : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var authentication_request_extra_params: Map<String, String>? = null
  var session_timeout: Int? = null
  var on_unauthenticated_request: On_unauthenticated_request? = null
  var scope: String? = null
  var session_cookie_name: String? = null
 

enum class On_unauthenticated_request(val theValue: String ) {
	 deny ("deny"), allow ("allow"), authenticate ("authenticate") ;
	override fun toString() = theValue
	}
}

class Redirect(val status_code : Status_code) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var host: String? = null
  var path: String? = null
  var port: String? = null
  var protocol: Protocol? = null
  var query: String? = null
 

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
	  var status_code: String? = null
  var message_body: String? = null
 

enum class Content_type(val theValue: String ) {
	 text_plain ("text/plain"), text_css ("text/css"), text_html ("text/html"), application_javascript ("application/javascript"), application_json ("application/json") ;
	override fun toString() = theValue
	}
}

class Authenticate_cognito(val user_pool_arn : String, val user_pool_client_id : String, val user_pool_domain : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var on_unauthenticated_request: On_unauthenticated_request? = null
  var scope: String? = null
  var session_cookie_name: String? = null
  var session_timeout: Int? = null
  var authentication_request_extra_params: Map<String, String>? = null
 

enum class On_unauthenticated_request(val theValue: String ) {
	 deny ("deny"), allow ("allow"), authenticate ("authenticate") ;
	override fun toString() = theValue
	}
}
}

class Condition() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var source_ip: List<Source_ip>? = null
  var values: List<String>? = null
  var field: Field? = null
  var host_header: List<Host_header>? = null
  var http_header: List<Http_header>? = null
  var http_request_method: List<Http_request_method>? = null
  var path_pattern: List<Path_pattern>? = null
  var query_string: List<Query_string>? = null
 

enum class Field(val theValue: String ) {
	 host_header ("host-header"), path_pattern ("path-pattern") ;
	override fun toString() = theValue
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

class Query_string(val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var key: String? = null
 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
