package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_transfer_server() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var host_key: String? = null
  var identity_provider_type: Identity_provider_type? = null
  var force_destroy: Boolean? = null
  var endpoint_details: List<Endpoint_details>? = null
  var invocation_role: String? = null
  var url: String? = null
  var logging_role: String? = null
  var tags: Map<String, String>? = null
  var endpoint_type: Endpoint_type? = null
 

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
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
fun invocation_roleRef(subPath: String = "") = ref(this, "invocation_role", subPath)
fun urlRef(subPath: String = "") = ref(this, "url", subPath)
fun identity_provider_typeRef(subPath: String = "") = ref(this, "identity_provider_type", subPath)
fun logging_roleRef(subPath: String = "") = ref(this, "logging_role", subPath)
fun server_idRef(subPath: String = "") = ref(this, "server_id", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
