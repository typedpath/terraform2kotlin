package com.typedpath.terraform2kotlin.aws.schema

class aws_waf_byte_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var byte_match_tuples: List<Byte_match_tuples>? = null
 


class Byte_match_tuples(val field_to_match : List<Field_to_match>, val positional_constraint : String, val text_transformation : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var target_string: String? = null
 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
}
