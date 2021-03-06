package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_waf_sql_injection_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var sql_injection_match_tuples: List<Sql_injection_match_tuples>? = null
 


class Sql_injection_match_tuples(val field_to_match : List<Field_to_match>, val text_transformation : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Field_to_match(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var data: String? = null
 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
