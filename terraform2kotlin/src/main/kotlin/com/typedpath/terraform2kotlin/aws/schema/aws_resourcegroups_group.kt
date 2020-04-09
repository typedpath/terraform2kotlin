package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_resourcegroups_group(val name : String, val resource_query : List<Resource_query>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 


class Resource_query(val query : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 TAG_FILTERS_1_0 ("TAG_FILTERS_1_0") ;
	override fun toString() = theValue
	}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
