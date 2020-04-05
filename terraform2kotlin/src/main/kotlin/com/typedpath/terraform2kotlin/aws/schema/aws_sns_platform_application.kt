package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sns_platform_application(val platform : String, val platform_credential : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var event_delivery_failure_topic_arn: String? = null
  var platform_principal: String? = null
  var success_feedback_sample_rate: String? = null
  var failure_feedback_role_arn: String? = null
  var success_feedback_role_arn: String? = null
  var event_endpoint_created_topic_arn: String? = null
  var event_endpoint_deleted_topic_arn: String? = null
  var event_endpoint_updated_topic_arn: String? = null
 

}
