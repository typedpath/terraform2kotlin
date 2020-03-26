package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cognito_identity_provider(val provider_details : Map<String, String>, val provider_name : String, val provider_type : String, val user_pool_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var attribute_mapping: Map<String, String>? = null
  var idp_identifiers: List<String>? = null
 

}
