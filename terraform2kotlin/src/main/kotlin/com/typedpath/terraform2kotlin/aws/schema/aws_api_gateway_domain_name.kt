package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_domain_name(val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var certificate_name: String? = null
  var regional_certificate_name: String? = null
  var certificate_chain: String? = null
  var regional_certificate_arn: String? = null
  var tags: Map<String, String>? = null
  var endpoint_configuration: List<Endpoint_configuration>? = null
  var certificate_body: String? = null
  var certificate_private_key: String? = null
  var security_policy: Security_policy? = null
  var certificate_arn: String? = null
 

enum class Security_policy(val theValue: String ) {
	 TLS_1_0 ("TLS_1_0"), TLS_1_2 ("TLS_1_2") ;
	override fun toString() = theValue
	}

class Endpoint_configuration(val types : List<Types>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Types(val theValue: String ) {
	 EDGE ("EDGE"), REGIONAL ("REGIONAL") ;
	override fun toString() = theValue
	}
}
}
