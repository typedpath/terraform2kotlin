package com.typedpath.terraform2kotlin.aws.schema

class aws_athena_named_query(val database : String, val name : String, val query : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var workgroup: String? = null
  var description: String? = null
 

}