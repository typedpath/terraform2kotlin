package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_thing_type(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var deprecated: Boolean? = null
  var properties: List<Properties>? = null
 


class Properties() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var description: String? = null
  var searchable_attributes: List<String>? = null
 

}
}
