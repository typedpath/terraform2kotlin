package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appsync_api_key(val api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var expires: String? = null
  var description: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
