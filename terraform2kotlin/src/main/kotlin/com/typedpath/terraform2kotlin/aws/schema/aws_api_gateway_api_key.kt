package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_api_key(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var stage_key: List<Stage_key>? = null
  var value: String? = null
  var tags: Map<String, String>? = null
  var enabled: Boolean? = null
 


class Stage_key(val rest_api_id : String, val stage_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
