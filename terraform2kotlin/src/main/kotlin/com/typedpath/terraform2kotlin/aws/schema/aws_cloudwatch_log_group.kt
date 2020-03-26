package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_log_group() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
  var retention_in_days: Int? = null
  var kms_key_id: String? = null
  var tags: Map<String, String>? = null
 

fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun creation_timeRef(subPath: String = "") = ref(this, "creation_time", subPath)
fun retention_in_daysRef(subPath: String = "") = ref(this, "retention_in_days", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
}
