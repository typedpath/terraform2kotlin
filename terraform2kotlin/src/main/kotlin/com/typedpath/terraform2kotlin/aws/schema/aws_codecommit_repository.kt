package com.typedpath.terraform2kotlin.aws.schema

class aws_codecommit_repository(val repository_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
  var default_branch: String? = null
 

}
