package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cognito_identity_pool(val identity_pool_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var supported_login_providers: Map<String, String>? = null
  var cognito_identity_providers: List<Cognito_identity_providers>? = null
  var allow_unauthenticated_identities: Boolean? = null
  var openid_connect_provider_arns: List<String>? = null
  var saml_provider_arns: List<String>? = null
  var developer_provider_name: String? = null
  var tags: Map<String, String>? = null
 


class Cognito_identity_providers() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var client_id: String? = null
  var provider_name: String? = null
  var server_side_token_check: Boolean? = null
 

}
}
