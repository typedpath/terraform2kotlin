package com.typedpath.terraform2kotlin.aws.schema

class aws_glue_classifier(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var xml_classifier: List<Xml_classifier>? = null
  var csv_classifier: List<Csv_classifier>? = null
  var grok_classifier: List<Grok_classifier>? = null
  var json_classifier: List<Json_classifier>? = null
 


class Xml_classifier(val classification : String, val row_tag : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Csv_classifier() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delimiter: String? = null
  var disable_value_trimming: Boolean? = null
  var header: List<String>? = null
  var quote_symbol: String? = null
  var allow_single_column: Boolean? = null
  var contains_header: Contains_header? = null
 

enum class Contains_header(val theValue: String ) {
	 UNKNOWN ("UNKNOWN"), PRESENT ("PRESENT"), ABSENT ("ABSENT") ;
	override fun toString() = theValue
	}
}

class Grok_classifier(val grok_pattern : String, val classification : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var custom_patterns: String? = null
 

}

class Json_classifier(val json_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
