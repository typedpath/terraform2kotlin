package com.typedpath.terraform2kotlin.aws.schema

class aws_lambda_permission(val action : String, val function_name : String, val principal : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var qualifier: String? = null
  var statement_id: String? = null
  var statement_id_prefix: String? = null
  var source_account: String? = null
  var source_arn: String? = null
  var event_source_token: String? = null
 

}
