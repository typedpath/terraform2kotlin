package com.typedpath.terraform2kotlin.aws.schema

class aws_sns_topic() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var display_name: String? = null
  var policy: String? = null
  var sqs_success_feedback_sample_rate: Int? = null
  var name: String? = null
  var name_prefix: String? = null
  var delivery_policy: String? = null
  var http_success_feedback_role_arn: String? = null
  var sqs_failure_feedback_role_arn: String? = null
  var tags: Map<String, String>? = null
  var application_success_feedback_role_arn: String? = null
  var http_failure_feedback_role_arn: String? = null
  var lambda_success_feedback_role_arn: String? = null
  var lambda_failure_feedback_role_arn: String? = null
  var sqs_success_feedback_role_arn: String? = null
  var application_success_feedback_sample_rate: Int? = null
  var application_failure_feedback_role_arn: String? = null
  var http_success_feedback_sample_rate: Int? = null
  var kms_master_key_id: String? = null
  var lambda_success_feedback_sample_rate: Int? = null
 

}
