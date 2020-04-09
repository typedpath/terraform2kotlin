package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_permission(val function_name : String, val principal : String, val action : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var source_arn: String? = null
  var statement_id_prefix: String? = null
  var event_source_token: String? = null
  var qualifier: String? = null
  var source_account: String? = null
  var statement_id: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
