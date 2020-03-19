package com.typedpath.terraform2kotlin.aws.schema

class aws_waf_xss_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var xss_match_tuples: List<Xss_match_tuples>? = null
 


class Xss_match_tuples(val text_transformation : String, val field_to_match : List<Field_to_match>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
}
