package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudfront_public_key(val encoded_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
  var comment: String? = null
 

}