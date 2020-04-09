package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_documentation_part(val location : List<Location>, val properties : String, val rest_api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Location(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var path: String? = null
  var status_code: String? = null
  var method: String? = null
  var name: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
