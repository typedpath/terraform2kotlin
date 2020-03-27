package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_policy(val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var description: String? = null
  var path: String? = null
  var name: String? = null
 

fun policyRef(subPath: String = "") = ref(this, "policy", subPath)
fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
