package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_policy_document() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="data"
	  var override_json: String? = null
  var policy_id: String? = null
  var source_json: String? = null
  var statement: List<statement>? = null
  var version: version? = null

} 

enum class version(val theValue: String ) {
	 _2008_10_17 ("2008-10-17"), _2012_10_17 ("2012-10-17") ;
	override fun toString() = theValue
	}

class statement() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var actions: List<String>? = null
  var not_actions: List<String>? = null
  var not_resources: List<String>? = null
  var not_principals: List<not_principals>? = null
  var sid: String? = null
  var effect: effect? = null
  var resources: List<String>? = null
  var principals: List<principals>? = null
  var condition: List<condition>? = null

} 

enum class effect(val theValue: String ) {
	 Allow ("Allow"), Deny ("Deny") ;
	override fun toString() = theValue
	}

class not_principals(val type: String, val identifiers: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	
} 


class principals(val type: String, val identifiers: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	
} 


class condition(val test: String, val variable: String, val values: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	
} 

