package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sns_topic() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var lambda_success_feedback_sample_rate: Int? = null
  var sqs_success_feedback_role_arn: String? = null
  var sqs_success_feedback_sample_rate: Int? = null
  var name: String? = null
  var display_name: String? = null
  var policy: String? = null
  var application_success_feedback_sample_rate: Int? = null
  var kms_master_key_id: String? = null
  var sqs_failure_feedback_role_arn: String? = null
  var name_prefix: String? = null
  var lambda_failure_feedback_role_arn: String? = null
  var application_success_feedback_role_arn: String? = null
  var application_failure_feedback_role_arn: String? = null
  var http_success_feedback_role_arn: String? = null
  var http_failure_feedback_role_arn: String? = null
  var lambda_success_feedback_role_arn: String? = null
  var delivery_policy: String? = null
  var http_success_feedback_sample_rate: Int? = null
  var tags: Map<String, String>? = null
 

fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
