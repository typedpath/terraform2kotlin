package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_acm_certificate() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var certificate_body: String? = null
  var private_key: String? = null
  var certificate_authority_arn: String? = null
  var domain_name: String? = null
  var subject_alternative_names: List<String>? = null
  var certificate_chain: String? = null
  var validation_method: String? = null
  var options: List<Options>? = null
  var tags: Map<String, String>? = null
 


class Options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var certificate_transparency_logging_preference: Certificate_transparency_logging_preference? = null
 

enum class Certificate_transparency_logging_preference(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}
}
fun typesRef(subPath: String = "") = ref(this, "types", subPath)
fun most_recentRef(subPath: String = "") = ref(this, "most_recent", subPath)
fun domainRef(subPath: String = "") = ref(this, "domain", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun statusesRef(subPath: String = "") = ref(this, "statuses", subPath)
fun key_typesRef(subPath: String = "") = ref(this, "key_types", subPath)
}
