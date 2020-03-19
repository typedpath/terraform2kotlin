package com.typedpath.terraform2kotlin.aws.schema

class aws_elastic_beanstalk_application_version(val bucket : String, val key : String, val name : String, val application : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var force_delete: Boolean? = null
  var tags: Map<String, String>? = null
  var description: String? = null
 

}
