package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_policy_document() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="data"
	  var override_json: String? = null
  var policy_id: String? = null
  var source_json: String? = null
  var statement: List<Statement>? = null
  var version: Version? = null
 

enum class Version(val theValue: String ) {
	 _2008_10_17 ("2008-10-17"), _2012_10_17 ("2012-10-17") ;
	override fun toString() = theValue
	}

class Statement() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var not_principals: List<Not_principals>? = null
  var condition: List<Condition>? = null
  var effect: Effect? = null
  var resources: List<String>? = null
  var principals: List<Principals>? = null
  var not_resources: List<String>? = null
  var sid: String? = null
  var actions: List<String>? = null
  var not_actions: List<String>? = null
 

enum class Effect(val theValue: String ) {
	 Allow ("Allow"), Deny ("Deny") ;
	override fun toString() = theValue
	}

class Not_principals(val type : String, val identifiers : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Condition(val test : String, val variable : String, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Principals(val identifiers : List<String>, val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
fun statementRef(subPath: String = "") = ref(this, "statement", subPath)
fun versionRef(subPath: String = "") = ref(this, "version", subPath)
fun jsonRef(subPath: String = "") = ref(this, "json", subPath)
fun override_jsonRef(subPath: String = "") = ref(this, "override_json", subPath)
fun policy_idRef(subPath: String = "") = ref(this, "policy_id", subPath)
fun source_jsonRef(subPath: String = "") = ref(this, "source_json", subPath)
}
