package com.typedpath.terraform2kotlin.aws.schema

class aws_servicecatalog_portfolio(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var provider_name: String? = null
  var tags: Map<String, String>? = null
 

}
