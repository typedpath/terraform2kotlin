package com.typedpath.terraform2kotlin.aws.schema

class aws_transfer_server() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var host_key: String? = null
  var logging_role: String? = null
  var url: String? = null
  var identity_provider_type: Identity_provider_type? = null
  var force_destroy: Boolean? = null
  var endpoint_type: Endpoint_type? = null
  var endpoint_details: List<Endpoint_details>? = null
  var invocation_role: String? = null
 

enum class Identity_provider_type(val theValue: String ) {
	 SERVICE_MANAGED ("SERVICE_MANAGED"), API_GATEWAY ("API_GATEWAY") ;
	override fun toString() = theValue
	}
enum class Endpoint_type(val theValue: String ) {
	 PUBLIC ("PUBLIC"), VPC_ENDPOINT ("VPC_ENDPOINT") ;
	override fun toString() = theValue
	}

class Endpoint_details(val vpc_endpoint_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
