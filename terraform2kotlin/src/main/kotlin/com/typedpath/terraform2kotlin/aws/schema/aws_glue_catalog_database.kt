package com.typedpath.terraform2kotlin.aws.schema

class aws_glue_catalog_database(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var catalog_id: String? = null
  var description: String? = null
  var location_uri: String? = null
  var parameters: Map<String, String>? = null
 

}