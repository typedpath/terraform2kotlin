package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_policy(val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var path: String? = null
  var name: String? = null
  var name_prefix: String? = null
 

}
