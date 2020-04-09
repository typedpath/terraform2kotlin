package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_athena_named_query(val name : String, val query : String, val database : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var workgroup: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
