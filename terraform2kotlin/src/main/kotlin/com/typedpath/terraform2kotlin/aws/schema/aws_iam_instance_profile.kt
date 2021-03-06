package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_instance_profile() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
  var path: String? = null
  var roles: List<String>? = null
  var role: String? = null
 

fun create_dateRef(subPath: String = "") = ref(this, "create_date", subPath)
fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun role_arnRef(subPath: String = "") = ref(this, "role_arn", subPath)
fun role_idRef(subPath: String = "") = ref(this, "role_id", subPath)
fun role_nameRef(subPath: String = "") = ref(this, "role_name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
