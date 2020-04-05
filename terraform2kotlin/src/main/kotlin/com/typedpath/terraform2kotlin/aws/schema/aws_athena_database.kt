package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_athena_database(val bucket : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var force_destroy: Boolean? = null
  var encryption_configuration: List<Encryption_configuration>? = null
 


class Encryption_configuration(val encryption_option : Encryption_option) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key: String? = null
 

enum class Encryption_option(val theValue: String ) {
	 CSE_KMS ("CSE_KMS"), SSE_KMS ("SSE_KMS"), SSE_S3 ("SSE_S3") ;
	override fun toString() = theValue
	}
}
}
