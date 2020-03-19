package com.typedpath.terraform2kotlin.aws.schema

class aws_sqs_queue() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var content_based_deduplication: Boolean? = null
  var kms_master_key_id: String? = null
  var name: String? = null
  var receive_wait_time_seconds: Int? = null
  var redrive_policy: String? = null
  var name_prefix: String? = null
  var max_message_size: Int? = null
  var message_retention_seconds: Int? = null
  var visibility_timeout_seconds: Int? = null
  var policy: String? = null
  var delay_seconds: Int? = null
  var fifo_queue: Boolean? = null
  var kms_data_key_reuse_period_seconds: Int? = null
  var tags: Map<String, String>? = null
 

}
