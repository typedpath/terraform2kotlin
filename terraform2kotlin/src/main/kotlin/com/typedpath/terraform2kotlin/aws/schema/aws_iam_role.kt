package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_role(val assume_role_policy: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var name: String? = null
  var permissions_boundary: String? = null
  var max_session_duration: Int? = null
  var path: String? = null
  var description: String? = null
  var force_detach_policies: Boolean? = null
  var name_prefix: String? = null

} 
