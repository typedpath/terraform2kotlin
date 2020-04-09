package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_redshift_parameter_group(val name : String, val family : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var parameter: List<Parameter>? = null
  var tags: Map<String, String>? = null
 


class Parameter(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
