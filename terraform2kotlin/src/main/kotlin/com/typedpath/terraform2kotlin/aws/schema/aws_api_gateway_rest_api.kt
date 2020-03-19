package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_rest_api(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var minimum_compression_size: Int? = null
  var tags: Map<String, String>? = null
  var binary_media_types: List<String>? = null
  var policy: String? = null
  var body: String? = null
  var endpoint_configuration: List<Endpoint_configuration>? = null
  var description: String? = null
  var api_key_source: Api_key_source? = null
 

enum class Api_key_source(val theValue: String ) {
	 AUTHORIZER ("AUTHORIZER"), HEADER ("HEADER") ;
	override fun toString() = theValue
	}

class Endpoint_configuration(val types : List<Types>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var vpc_endpoint_ids: List<String>? = null
 

enum class Types(val theValue: String ) {
	 EDGE ("EDGE"), REGIONAL ("REGIONAL"), PRIVATE ("PRIVATE") ;
	override fun toString() = theValue
	}
}
}
