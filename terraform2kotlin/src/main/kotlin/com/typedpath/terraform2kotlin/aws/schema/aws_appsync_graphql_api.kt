package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appsync_graphql_api(val authentication_type : Authentication_type, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var xray_enabled: Boolean? = null
  var additional_authentication_provider: List<Additional_authentication_provider>? = null
  var log_config: List<Log_config>? = null
  var openid_connect_config: List<Openid_connect_config>? = null
  var user_pool_config: List<User_pool_config>? = null
  var schema: String? = null
 

enum class Authentication_type(val theValue: String ) {
	 API_KEY ("API_KEY"), AWS_IAM ("AWS_IAM"), AMAZON_COGNITO_USER_POOLS ("AMAZON_COGNITO_USER_POOLS"), OPENID_CONNECT ("OPENID_CONNECT") ;
	override fun toString() = theValue
	}

class Additional_authentication_provider(val authentication_type : Authentication_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var openid_connect_config: List<Openid_connect_config>? = null
  var user_pool_config: List<User_pool_config>? = null
 

enum class Authentication_type(val theValue: String ) {
	 API_KEY ("API_KEY"), AWS_IAM ("AWS_IAM"), AMAZON_COGNITO_USER_POOLS ("AMAZON_COGNITO_USER_POOLS"), OPENID_CONNECT ("OPENID_CONNECT") ;
	override fun toString() = theValue
	}

class Openid_connect_config(val issuer : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var auth_ttl: Int? = null
  var client_id: String? = null
  var iat_ttl: Int? = null
 

}

class User_pool_config(val user_pool_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var app_id_client_regex: String? = null
  var aws_region: String? = null
 

}
}

class Log_config(val cloudwatch_logs_role_arn : String, val field_log_level : Field_log_level) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Field_log_level(val theValue: String ) {
	 ALL ("ALL"), ERROR ("ERROR"), NONE ("NONE") ;
	override fun toString() = theValue
	}
}

class Openid_connect_config(val issuer : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var auth_ttl: Int? = null
  var client_id: String? = null
  var iat_ttl: Int? = null
 

}

class User_pool_config(val default_action : Default_action, val user_pool_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var app_id_client_regex: String? = null
  var aws_region: String? = null
 

enum class Default_action(val theValue: String ) {
	 ALLOW ("ALLOW"), DENY ("DENY") ;
	override fun toString() = theValue
	}
}
}
