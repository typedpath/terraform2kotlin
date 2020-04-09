package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_mq_configuration(val data : String, val engine_type : String, val engine_version : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
