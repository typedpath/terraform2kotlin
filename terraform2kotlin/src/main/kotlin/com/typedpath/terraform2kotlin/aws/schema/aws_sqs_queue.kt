package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sqs_queue() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var policy: String? = null
  var fifo_queue: Boolean? = null
  var content_based_deduplication: Boolean? = null
  var kms_data_key_reuse_period_seconds: Int? = null
  var name_prefix: String? = null
  var visibility_timeout_seconds: Int? = null
  var redrive_policy: String? = null
  var max_message_size: Int? = null
  var message_retention_seconds: Int? = null
  var receive_wait_time_seconds: Int? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var delay_seconds: Int? = null
  var kms_master_key_id: String? = null
 

fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun urlRef(subPath: String = "") = ref(this, "url", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
