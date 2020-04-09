package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_batch_job_definition(val name : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var retry_strategy: List<Retry_strategy>? = null
  var timeout: List<Timeout>? = null
  var container_properties: String? = null
  var parameters: Map<String, String>? = null
 

enum class Type(val theValue: String ) {
	 container ("container") ;
	override fun toString() = theValue
	}

class Timeout() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var attempt_duration_seconds: Int? = null
 

}

class Retry_strategy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var attempts: Int? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
