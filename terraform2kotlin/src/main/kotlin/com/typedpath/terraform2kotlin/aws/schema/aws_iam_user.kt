package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_user(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var permissions_boundary: String? = null
  var force_destroy: Boolean? = null
  var tags: Map<String, String>? = null
  var path: String? = null
 

}
