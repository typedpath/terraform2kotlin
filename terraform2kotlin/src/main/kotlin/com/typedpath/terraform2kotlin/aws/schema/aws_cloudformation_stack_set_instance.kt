package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudformation_stack_set_instance(val stack_set_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var account_id: String? = null
  var parameter_overrides: Map<String, String>? = null
  var retain_stack: Boolean? = null
  var region: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
