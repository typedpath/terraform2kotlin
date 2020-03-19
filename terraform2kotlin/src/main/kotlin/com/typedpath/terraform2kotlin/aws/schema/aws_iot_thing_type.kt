package com.typedpath.terraform2kotlin.aws.schema

class aws_iot_thing_type(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var properties: List<Properties>? = null
  var deprecated: Boolean? = null
 


class Properties() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var description: String? = null
  var searchable_attributes: List<String>? = null
 

}
}
