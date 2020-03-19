package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_service_linked_role(val aws_service_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var custom_suffix: String? = null
  var description: String? = null
 

}
