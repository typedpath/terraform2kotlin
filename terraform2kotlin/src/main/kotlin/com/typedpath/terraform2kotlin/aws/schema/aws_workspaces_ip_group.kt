package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_workspaces_ip_group(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var rules: List<Rules>? = null
  var tags: Map<String, String>? = null
  var description: String? = null
 


class Rules(val source : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var description: String? = null
 

}
}
