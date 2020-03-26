package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_rest_api(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var policy: String? = null
  var binary_media_types: List<String>? = null
  var minimum_compression_size: Int? = null
  var endpoint_configuration: List<Endpoint_configuration>? = null
  var tags: Map<String, String>? = null
  var api_key_source: Api_key_source? = null
  var body: String? = null
 

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
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun policyRef(subPath: String = "") = ref(this, "policy", subPath)
fun minimum_compression_sizeRef(subPath: String = "") = ref(this, "minimum_compression_size", subPath)
fun endpoint_configurationRef(subPath: String = "") = ref(this, "endpoint_configuration", subPath)
fun execution_arnRef(subPath: String = "") = ref(this, "execution_arn", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun api_key_sourceRef(subPath: String = "") = ref(this, "api_key_source", subPath)
fun binary_media_typesRef(subPath: String = "") = ref(this, "binary_media_types", subPath)
fun root_resource_idRef(subPath: String = "") = ref(this, "root_resource_id", subPath)
}
