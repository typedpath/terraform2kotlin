package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudformation_stack(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var policy_url: String? = null
  var timeout_in_minutes: Int? = null
  var tags: Map<String, String>? = null
  var disable_rollback: Boolean? = null
  var template_body: String? = null
  var capabilities: List<String>? = null
  var notification_arns: List<String>? = null
  var iam_role_arn: String? = null
  var on_failure: String? = null
  var parameters: Map<String, String>? = null
  var template_url: String? = null
  var policy_body: String? = null
 

}
