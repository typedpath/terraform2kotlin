package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudformation_stack(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var timeout_in_minutes: Int? = null
  var iam_role_arn: String? = null
  var template_body: String? = null
  var template_url: String? = null
  var notification_arns: List<String>? = null
  var policy_body: String? = null
  var on_failure: String? = null
  var tags: Map<String, String>? = null
  var capabilities: List<String>? = null
  var disable_rollback: Boolean? = null
  var parameters: Map<String, String>? = null
  var policy_url: String? = null
 

fun timeout_in_minutesRef(subPath: String = "") = ref(this, "timeout_in_minutes", subPath)
fun iam_role_arnRef(subPath: String = "") = ref(this, "iam_role_arn", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun template_bodyRef(subPath: String = "") = ref(this, "template_body", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun notification_arnsRef(subPath: String = "") = ref(this, "notification_arns", subPath)
fun outputsRef(subPath: String = "") = ref(this, "outputs", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun capabilitiesRef(subPath: String = "") = ref(this, "capabilities", subPath)
fun disable_rollbackRef(subPath: String = "") = ref(this, "disable_rollback", subPath)
fun parametersRef(subPath: String = "") = ref(this, "parameters", subPath)
}
