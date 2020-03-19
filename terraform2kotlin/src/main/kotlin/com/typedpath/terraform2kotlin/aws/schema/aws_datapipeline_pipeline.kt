package com.typedpath.terraform2kotlin.aws.schema

class aws_datapipeline_pipeline(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
 

}
