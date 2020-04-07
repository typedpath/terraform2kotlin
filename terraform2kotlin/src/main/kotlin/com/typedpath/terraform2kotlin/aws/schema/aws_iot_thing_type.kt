package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_thing_type(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var properties: List<Properties>? = null
  var deprecated: Boolean? = null
 


class Properties() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var searchable_attributes: List<String>? = null
  var description: String? = null
 

}
}
