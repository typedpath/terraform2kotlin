package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sns_sms_preferences() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var monthly_spend_limit: String? = null
  var delivery_status_iam_role_arn: String? = null
  var delivery_status_success_sampling_rate: String? = null
  var default_sender_id: String? = null
  var default_sms_type: Default_sms_type? = null
  var usage_report_s3_bucket: String? = null
 

enum class Default_sms_type(val theValue: String ) {
	 Promotional ("Promotional"), Transactional ("Transactional") ;
	override fun toString() = theValue
	}
}
