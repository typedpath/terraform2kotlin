package com.typedpath.terraform2kotlin.aws.schema

class aws_cognito_user_pool_client(val user_pool_id : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var generate_secret: Boolean? = null
  var explicit_auth_flows: List<Explicit_auth_flows>? = null
  var logout_urls: List<String>? = null
  var read_attributes: List<String>? = null
  var allowed_oauth_flows: List<Allowed_oauth_flows>? = null
  var allowed_oauth_flows_user_pool_client: Boolean? = null
  var refresh_token_validity: Int? = null
  var allowed_oauth_scopes: List<String>? = null
  var callback_urls: List<String>? = null
  var default_redirect_uri: String? = null
  var supported_identity_providers: List<String>? = null
  var write_attributes: List<String>? = null
 

enum class Explicit_auth_flows(val theValue: String ) {
	 ADMIN_NO_SRP_AUTH ("ADMIN_NO_SRP_AUTH"), CUSTOM_AUTH_FLOW_ONLY ("CUSTOM_AUTH_FLOW_ONLY"), USER_PASSWORD_AUTH ("USER_PASSWORD_AUTH"), ALLOW_ADMIN_USER_PASSWORD_AUTH ("ALLOW_ADMIN_USER_PASSWORD_AUTH"), ALLOW_CUSTOM_AUTH ("ALLOW_CUSTOM_AUTH"), ALLOW_USER_PASSWORD_AUTH ("ALLOW_USER_PASSWORD_AUTH"), ALLOW_USER_SRP_AUTH ("ALLOW_USER_SRP_AUTH"), ALLOW_REFRESH_TOKEN_AUTH ("ALLOW_REFRESH_TOKEN_AUTH") ;
	override fun toString() = theValue
	}
enum class Allowed_oauth_flows(val theValue: String ) {
	 code ("code"), implicit ("implicit"), client_credentials ("client_credentials") ;
	override fun toString() = theValue
	}
}
