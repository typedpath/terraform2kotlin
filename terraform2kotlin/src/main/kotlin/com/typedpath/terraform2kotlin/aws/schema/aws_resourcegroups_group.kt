package com.typedpath.terraform2kotlin.aws.schema

class aws_resourcegroups_group(val resource_query : List<Resource_query>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
 


class Resource_query(val query : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 TAG_FILTERS_1_0 ("TAG_FILTERS_1_0") ;
	override fun toString() = theValue
	}
}
}
