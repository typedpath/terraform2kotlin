package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_key_pair(val public_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var key_name: String? = null
  var key_name_prefix: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
