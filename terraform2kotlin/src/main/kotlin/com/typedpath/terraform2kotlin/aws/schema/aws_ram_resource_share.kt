package com.typedpath.terraform2kotlin.aws.schema

class aws_ram_resource_share(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var allow_external_principals: Boolean? = null
  var tags: Map<String, String>? = null
 

}
