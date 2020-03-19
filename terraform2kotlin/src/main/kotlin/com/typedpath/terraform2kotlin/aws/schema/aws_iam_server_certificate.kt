package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_server_certificate(val certificate_body : String, val private_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var certificate_chain: String? = null
  var path: String? = null
  var name: String? = null
  var name_prefix: String? = null
  var arn: String? = null
 

}
