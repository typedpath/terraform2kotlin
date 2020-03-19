package com.typedpath.terraform2kotlin.aws.schema

class aws_lambda_function(val function_name : String, val handler : String, val role : String, val runtime : Runtime) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var s3_object_version: String? = null
  var layers: List<String>? = null
  var reserved_concurrent_executions: Int? = null
  var publish: Boolean? = null
  var vpc_config: List<Vpc_config>? = null
  var tags: Map<String, String>? = null
  var s3_key: String? = null
  var dead_letter_config: List<Dead_letter_config>? = null
  var memory_size: Int? = null
  var environment: List<Environment>? = null
  var tracing_config: List<Tracing_config>? = null
  var kms_key_arn: String? = null
  var filename: String? = null
  var s3_bucket: String? = null
  var timeout: Int? = null
  var source_code_hash: String? = null
  var description: String? = null
 

enum class Runtime(val theValue: String ) {
	 dotnetcore1_0 ("dotnetcore1.0"), dotnetcore2_0 ("dotnetcore2.0"), dotnetcore2_1 ("dotnetcore2.1"), go1_x ("go1.x"), java8 ("java8"), java11 ("java11"), nodejs4_3 ("nodejs4.3"), nodejs4_3_edge ("nodejs4.3-edge"), nodejs6_10 ("nodejs6.10"), nodejs8_10 ("nodejs8.10"), nodejs10_x ("nodejs10.x"), nodejs12_x ("nodejs12.x"), provided ("provided"), python2_7 ("python2.7"), python3_6 ("python3.6"), python3_7 ("python3.7"), python3_8 ("python3.8"), ruby2_5 ("ruby2.5"), ruby2_7 ("ruby2.7") ;
	override fun toString() = theValue
	}

class Tracing_config(val mode : Mode) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Mode(val theValue: String ) {
	 Active ("Active"), PassThrough ("PassThrough") ;
	override fun toString() = theValue
	}
}

class Vpc_config(val subnet_ids : List<String>, val security_group_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Dead_letter_config(val target_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Environment() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var variables: Map<String, String>? = null
 

}
}
