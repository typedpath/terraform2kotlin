package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codepipeline_webhook(val authentication : Authentication, val filter : List<Filter>, val name : String, val target_action : String, val target_pipeline : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var authentication_configuration: List<Authentication_configuration>? = null
 

enum class Authentication(val theValue: String ) {
	 GITHUB_HMAC ("GITHUB_HMAC"), IP ("IP"), UNAUTHENTICATED ("UNAUTHENTICATED") ;
	override fun toString() = theValue
	}

class Filter(val json_path : String, val match_equals : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Authentication_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var secret_token: String? = null
  var allowed_ip_range: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
