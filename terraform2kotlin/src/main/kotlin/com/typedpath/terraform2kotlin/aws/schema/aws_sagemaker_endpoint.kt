package com.typedpath.terraform2kotlin.aws.schema

class aws_sagemaker_endpoint(val endpoint_config_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var tags: Map<String, String>? = null
 

}