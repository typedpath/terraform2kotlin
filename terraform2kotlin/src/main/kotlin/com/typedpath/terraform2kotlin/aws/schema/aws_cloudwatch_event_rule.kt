package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_event_rule() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var name_prefix: String? = null
  var schedule_expression: String? = null
  var event_pattern: String? = null
  var description: String? = null
  var role_arn: String? = null
  var is_enabled: Boolean? = null
  var name: String? = null
 

}
