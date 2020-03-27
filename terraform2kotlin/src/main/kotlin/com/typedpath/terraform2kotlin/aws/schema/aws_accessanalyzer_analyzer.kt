package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_accessanalyzer_analyzer(val analyzer_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var type: Type? = null
  var tags: Map<String, String>? = null
 

enum class Type(val theValue: String ) {
	 ACCOUNT ("ACCOUNT") ;
	override fun toString() = theValue
	}
}
