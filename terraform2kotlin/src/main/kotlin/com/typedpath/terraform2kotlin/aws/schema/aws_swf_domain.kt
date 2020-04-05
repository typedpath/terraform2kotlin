package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_swf_domain(val workflow_execution_retention_period_in_days : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var name: String? = null
  var name_prefix: String? = null
  var description: String? = null
 

}
