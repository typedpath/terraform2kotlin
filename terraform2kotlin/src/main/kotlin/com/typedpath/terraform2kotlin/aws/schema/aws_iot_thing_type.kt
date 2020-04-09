package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_thing_type(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var deprecated: Boolean? = null
  var properties: List<Properties>? = null
 


class Properties() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var searchable_attributes: List<String>? = null
  var description: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
