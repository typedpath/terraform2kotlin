package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_role(val assume_role_policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var force_detach_policies: Boolean? = null
  var max_session_duration: Int? = null
  var tags: Map<String, String>? = null
  var name_prefix: String? = null
  var path: String? = null
  var permissions_boundary: String? = null
  var name: String? = null
  var description: String? = null
 

fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun role_nameRef(subPath: String = "") = ref(this, "role_name", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun max_session_durationRef(subPath: String = "") = ref(this, "max_session_duration", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun assume_role_policy_documentRef(subPath: String = "") = ref(this, "assume_role_policy_document", subPath)
fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun permissions_boundaryRef(subPath: String = "") = ref(this, "permissions_boundary", subPath)
fun assume_role_policyRef(subPath: String = "") = ref(this, "assume_role_policy", subPath)
fun role_idRef(subPath: String = "") = ref(this, "role_id", subPath)
fun unique_idRef(subPath: String = "") = ref(this, "unique_id", subPath)
fun create_dateRef(subPath: String = "") = ref(this, "create_date", subPath)
}
