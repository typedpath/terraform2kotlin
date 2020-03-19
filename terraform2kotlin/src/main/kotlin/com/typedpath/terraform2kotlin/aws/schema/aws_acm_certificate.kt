package com.typedpath.terraform2kotlin.aws.schema

class aws_acm_certificate() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var options: List<Options>? = null
  var tags: Map<String, String>? = null
  var certificate_body: String? = null
  var private_key: String? = null
  var certificate_authority_arn: String? = null
  var subject_alternative_names: List<String>? = null
  var certificate_chain: String? = null
  var domain_name: String? = null
  var validation_method: String? = null
 


class Options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var certificate_transparency_logging_preference: Certificate_transparency_logging_preference? = null
 

enum class Certificate_transparency_logging_preference(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}
}
}
