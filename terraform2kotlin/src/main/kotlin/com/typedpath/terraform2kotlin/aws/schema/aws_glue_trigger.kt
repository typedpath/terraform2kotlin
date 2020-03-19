package com.typedpath.terraform2kotlin.aws.schema

class aws_glue_trigger(val name : String, val type : Type, val actions : List<Actions>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var predicate: List<Predicate>? = null
  var tags: Map<String, String>? = null
  var workflow_name: String? = null
  var description: String? = null
  var enabled: Boolean? = null
  var schedule: String? = null
 

enum class Type(val theValue: String ) {
	 CONDITIONAL ("CONDITIONAL"), ON_DEMAND ("ON_DEMAND"), SCHEDULED ("SCHEDULED") ;
	override fun toString() = theValue
	}

class Actions() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var arguments: Map<String, String>? = null
  var crawler_name: String? = null
  var job_name: String? = null
  var timeout: Int? = null
 

}

class Predicate(val conditions : List<Conditions>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var logical: Logical? = null
 

enum class Logical(val theValue: String ) {
	 AND ("AND"), ANY ("ANY") ;
	override fun toString() = theValue
	}

class Conditions() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var job_name: String? = null
  var crawler_name: String? = null
  var logical_operator: Logical_operator? = null
  var state: State? = null
  var crawl_state: Crawl_state? = null
 

enum class Logical_operator(val theValue: String ) {
	 EQUALS ("EQUALS") ;
	override fun toString() = theValue
	}
enum class State(val theValue: String ) {
	 FAILED ("FAILED"), STOPPED ("STOPPED"), SUCCEEDED ("SUCCEEDED"), TIMEOUT ("TIMEOUT") ;
	override fun toString() = theValue
	}
enum class Crawl_state(val theValue: String ) {
	 RUNNING ("RUNNING"), SUCCEEDED ("SUCCEEDED"), CANCELLED ("CANCELLED"), FAILED ("FAILED") ;
	override fun toString() = theValue
	}
}
}
}
