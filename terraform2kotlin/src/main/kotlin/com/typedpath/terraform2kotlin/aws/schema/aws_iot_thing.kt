package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_thing(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var thing_type_name: String? = null
  var attributes: Map<String, String>? = null
 

}
