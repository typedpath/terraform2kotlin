package com.typedpath.terraform2kotlin.aws.schema

class aws_elasticache_subnet_group(val name : String, val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

}
