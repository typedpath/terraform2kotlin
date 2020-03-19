package com.typedpath.terraform2kotlin.aws.schema

class aws_athena_workgroup(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var configuration: List<Configuration>? = null
  var description: String? = null
  var state: State? = null
  var tags: Map<String, String>? = null
 

enum class State(val theValue: String ) {
	 DISABLED ("DISABLED"), ENABLED ("ENABLED") ;
	override fun toString() = theValue
	}

class Configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var result_configuration: List<Result_configuration>? = null
  var bytes_scanned_cutoff_per_query: Int? = null
  var enforce_workgroup_configuration: Boolean? = null
  var publish_cloudwatch_metrics_enabled: Boolean? = null
 


class Result_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_configuration: List<Encryption_configuration>? = null
  var output_location: String? = null
 


class Encryption_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_option: Encryption_option? = null
  var kms_key_arn: String? = null
 

enum class Encryption_option(val theValue: String ) {
	 CSE_KMS ("CSE_KMS"), SSE_KMS ("SSE_KMS"), SSE_S3 ("SSE_S3") ;
	override fun toString() = theValue
	}
}
}
}
}
