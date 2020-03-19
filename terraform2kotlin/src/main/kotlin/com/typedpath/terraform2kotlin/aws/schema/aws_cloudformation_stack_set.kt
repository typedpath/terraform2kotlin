package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudformation_stack_set(val administration_role_arn : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var template_body: String? = null
  var capabilities: List<Capabilities>? = null
  var description: String? = null
  var execution_role_name: String? = null
  var parameters: Map<String, String>? = null
  var tags: Map<String, String>? = null
  var template_url: String? = null
 

enum class Capabilities(val theValue: String ) {
	 CAPABILITY_AUTO_EXPAND ("CAPABILITY_AUTO_EXPAND"), CAPABILITY_IAM ("CAPABILITY_IAM"), CAPABILITY_NAMED_IAM ("CAPABILITY_NAMED_IAM") ;
	override fun toString() = theValue
	}
}