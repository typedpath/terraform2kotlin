package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_waf_rate_based_rule(val metric_name : String, val rate_key : String, val rate_limit : Int, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var predicates: List<Predicates>? = null
  var tags: Map<String, String>? = null
 


class Predicates(val type : Type, val negated : Boolean, val data_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 ByteMatch ("ByteMatch"), GeoMatch ("GeoMatch"), IPMatch ("IPMatch"), RegexMatch ("RegexMatch"), SizeConstraint ("SizeConstraint"), SqlInjectionMatch ("SqlInjectionMatch"), XssMatch ("XssMatch") ;
	override fun toString() = theValue
	}
}
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
