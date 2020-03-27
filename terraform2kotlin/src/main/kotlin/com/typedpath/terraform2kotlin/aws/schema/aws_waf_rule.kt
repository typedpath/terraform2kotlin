package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_waf_rule(val name : String, val metric_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var predicates: List<Predicates>? = null
  var tags: Map<String, String>? = null
 


class Predicates(val negated : Boolean, val data_id : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 ByteMatch ("ByteMatch"), GeoMatch ("GeoMatch"), IPMatch ("IPMatch"), RegexMatch ("RegexMatch"), SizeConstraint ("SizeConstraint"), SqlInjectionMatch ("SqlInjectionMatch"), XssMatch ("XssMatch") ;
	override fun toString() = theValue
	}
}
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
