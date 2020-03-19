package com.typedpath.terraform2kotlin.aws.schema

class aws_glue_security_configuration(val encryption_configuration : List<Encryption_configuration>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Encryption_configuration(val cloudwatch_encryption : List<Cloudwatch_encryption>, val job_bookmarks_encryption : List<Job_bookmarks_encryption>, val s3_encryption : List<S3_encryption>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Cloudwatch_encryption() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cloudwatch_encryption_mode: Cloudwatch_encryption_mode? = null
  var kms_key_arn: String? = null
 

enum class Cloudwatch_encryption_mode(val theValue: String ) {
	 DISABLED ("DISABLED"), SSE_KMS ("SSE-KMS") ;
	override fun toString() = theValue
	}
}

class Job_bookmarks_encryption() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var job_bookmarks_encryption_mode: Job_bookmarks_encryption_mode? = null
  var kms_key_arn: String? = null
 

enum class Job_bookmarks_encryption_mode(val theValue: String ) {
	 CSE_KMS ("CSE-KMS"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}
}

class S3_encryption() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_arn: String? = null
  var s3_encryption_mode: S3_encryption_mode? = null
 

enum class S3_encryption_mode(val theValue: String ) {
	 DISABLED ("DISABLED"), SSE_KMS ("SSE-KMS"), SSE_S3 ("SSE-S3") ;
	override fun toString() = theValue
	}
}
}
}
