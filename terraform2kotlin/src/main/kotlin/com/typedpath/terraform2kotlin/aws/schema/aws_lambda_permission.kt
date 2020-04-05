package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_permission(val function_name : String, val action : String, val principal : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var event_source_token: String? = null
  var qualifier: String? = null
  var source_arn: String? = null
  var statement_id_prefix: String? = null
  var source_account: String? = null
  var statement_id: String? = null
 

}
