package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_wafregional_byte_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var byte_match_tuple: List<Byte_match_tuple>? = null
  var byte_match_tuples: List<Byte_match_tuples>? = null
 


class Byte_match_tuple(val field_to_match : List<Field_to_match>, val positional_constraint : String, val text_transformation : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var target_string: String? = null
 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}

class Byte_match_tuples(val field_to_match : List<Field_to_match>, val positional_constraint : String, val text_transformation : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var target_string: String? = null
 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
}
