package com.typedpath.terraform2kotlin.aws.schema

class aws_elasticache_security_group(val name : String, val security_group_names : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

}
