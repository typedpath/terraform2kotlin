package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_deployment(val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var stage_description: String? = null
  var variables: Map<String, String>? = null
  var stage_name: String? = null
  var description: String? = null
 

}
