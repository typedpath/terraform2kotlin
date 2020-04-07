package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_authorizer(val name : String, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var authorizer_result_ttl_in_seconds: Int? = null
  var provider_arns: List<String>? = null
  var identity_source: String? = null
  var type: Type? = null
  var authorizer_credentials: String? = null
  var identity_validation_expression: String? = null
  var authorizer_uri: String? = null
 

enum class Type(val theValue: String ) {
	 COGNITO_USER_POOLS ("COGNITO_USER_POOLS"), REQUEST ("REQUEST"), TOKEN ("TOKEN") ;
	override fun toString() = theValue
	}
}
