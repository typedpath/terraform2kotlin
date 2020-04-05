package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_batch_job_definition(val type : Type, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var container_properties: String? = null
  var parameters: Map<String, String>? = null
  var retry_strategy: List<Retry_strategy>? = null
  var timeout: List<Timeout>? = null
 

enum class Type(val theValue: String ) {
	 container ("container") ;
	override fun toString() = theValue
	}

class Retry_strategy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var attempts: Int? = null
 

}

class Timeout() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var attempt_duration_seconds: Int? = null
 

}
}
