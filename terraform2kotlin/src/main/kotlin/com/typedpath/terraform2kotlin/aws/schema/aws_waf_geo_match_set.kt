package com.typedpath.terraform2kotlin.aws.schema

class aws_waf_geo_match_set(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var geo_match_constraint: List<Geo_match_constraint>? = null
 


class Geo_match_constraint(val type : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
