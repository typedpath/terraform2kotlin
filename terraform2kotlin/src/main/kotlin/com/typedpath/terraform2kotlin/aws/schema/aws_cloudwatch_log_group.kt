package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_log_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var retention_in_days: Int? = null
  var kms_key_id: String? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var name_prefix: String? = null
 

}
