package com.typedpath.terraform2kotlin.aws.schema

class aws_docdb_subnet_group(val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
  var description: String? = null
  var tags: Map<String, String>? = null
 

}