package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_instance_profile() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
  var path: String? = null
  var roles: List<String>? = null
  var role: String? = null
 

}
