package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_group(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var path: String? = null
 

fun usersRef(subPath: String = "") = ref(this, "users", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun group_idRef(subPath: String = "") = ref(this, "group_id", subPath)
fun group_nameRef(subPath: String = "") = ref(this, "group_name", subPath)
}
