package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_wafregional_regex_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var regex_match_tuple: List<Regex_match_tuple>? = null
 


class Regex_match_tuple(val field_to_match : List<Field_to_match>, val regex_pattern_set_id : String, val text_transformation : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
