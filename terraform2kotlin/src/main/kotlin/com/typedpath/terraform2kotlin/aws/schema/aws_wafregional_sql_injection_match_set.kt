package com.typedpath.terraform2kotlin.aws.schema

class aws_wafregional_sql_injection_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var sql_injection_match_tuple: List<Sql_injection_match_tuple>? = null
 


class Sql_injection_match_tuple(val field_to_match : List<Field_to_match>, val text_transformation : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
}
