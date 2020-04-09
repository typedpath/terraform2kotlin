package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_workspaces_ip_group(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var rules: List<Rules>? = null
  var tags: Map<String, String>? = null
 


class Rules(val source : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var description: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
