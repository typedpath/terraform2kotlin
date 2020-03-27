package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_user(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var force_destroy: Boolean? = null
  var tags: Map<String, String>? = null
  var path: String? = null
  var permissions_boundary: String? = null
 

fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun permissions_boundaryRef(subPath: String = "") = ref(this, "permissions_boundary", subPath)
fun user_idRef(subPath: String = "") = ref(this, "user_id", subPath)
fun user_nameRef(subPath: String = "") = ref(this, "user_name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
