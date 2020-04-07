package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_neptune_cluster_parameter_group(val family : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var parameter: List<Parameter>? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var name_prefix: String? = null
  var description: String? = null
 


class Parameter(val value : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var apply_method: Apply_method? = null
 

enum class Apply_method(val theValue: String ) {
	 immediate ("immediate"), pending_reboot ("pending-reboot") ;
	override fun toString() = theValue
	}
}
}
