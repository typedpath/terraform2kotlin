package com.typedpath.terraform2kotlin.aws.schema

class aws_appsync_api_key(val api_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var expires: String? = null
 

}