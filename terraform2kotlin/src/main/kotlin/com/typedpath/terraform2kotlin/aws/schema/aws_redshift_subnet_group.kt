package com.typedpath.terraform2kotlin.aws.schema

class aws_redshift_subnet_group(val name : String, val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 

}
