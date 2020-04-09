package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elasticache_security_group(val security_group_names : List<String>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
