package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glue_catalog_database(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var location_uri: String? = null
  var parameters: Map<String, String>? = null
  var catalog_id: String? = null
 

}
