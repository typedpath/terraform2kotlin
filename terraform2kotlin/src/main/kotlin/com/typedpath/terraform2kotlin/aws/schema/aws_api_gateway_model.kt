package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_model(val rest_api_id : String, val name : String, val content_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var schema: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
