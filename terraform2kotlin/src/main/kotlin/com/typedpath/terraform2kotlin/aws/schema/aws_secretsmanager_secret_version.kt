package com.typedpath.terraform2kotlin.aws.schema

class aws_secretsmanager_secret_version(val secret_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var secret_string: String? = null
  var secret_binary: String? = null
  var version_stages: List<String>? = null
 

}
