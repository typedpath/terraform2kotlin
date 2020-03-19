package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudformation_stack_set_instance(val stack_set_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var retain_stack: Boolean? = null
  var region: String? = null
  var account_id: String? = null
  var parameter_overrides: Map<String, String>? = null
 

}
