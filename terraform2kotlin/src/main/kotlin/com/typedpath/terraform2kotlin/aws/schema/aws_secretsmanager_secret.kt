package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_secretsmanager_secret() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var kms_key_id: String? = null
  var name_prefix: String? = null
  var policy: String? = null
  var recovery_window_in_days: Int? = null
  var rotation_lambda_arn: String? = null
  var description: String? = null
  var name: String? = null
  var rotation_rules: List<Rotation_rules>? = null
  var tags: Map<String, String>? = null
 


class Rotation_rules(val automatically_after_days : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun rotation_rulesRef(subPath: String = "") = ref(this, "rotation_rules", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun policyRef(subPath: String = "") = ref(this, "policy", subPath)
fun rotation_enabledRef(subPath: String = "") = ref(this, "rotation_enabled", subPath)
fun rotation_lambda_arnRef(subPath: String = "") = ref(this, "rotation_lambda_arn", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
