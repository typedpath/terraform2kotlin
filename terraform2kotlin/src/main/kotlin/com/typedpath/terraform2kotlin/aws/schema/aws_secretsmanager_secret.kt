package com.typedpath.terraform2kotlin.aws.schema

class aws_secretsmanager_secret() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
  var recovery_window_in_days: Int? = null
  var rotation_lambda_arn: String? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var rotation_rules: List<Rotation_rules>? = null
  var kms_key_id: String? = null
  var policy: String? = null
 


class Rotation_rules(val automatically_after_days : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
