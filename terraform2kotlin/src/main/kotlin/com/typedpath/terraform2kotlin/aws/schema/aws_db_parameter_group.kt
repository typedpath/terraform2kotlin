package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_parameter_group(val family : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var parameter: List<Parameter>? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var name_prefix: String? = null
 


class Parameter(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var apply_method: String? = null
 

}
}
