package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_documentation_part(val location : List<Location>, val properties : String, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Location(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var method: String? = null
  var name: String? = null
  var path: String? = null
  var status_code: String? = null
 

}
}
