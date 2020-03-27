package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_kms_alias(val target_key_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
 

fun target_key_idRef(subPath: String = "") = ref(this, "target_key_id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun target_key_arnRef(subPath: String = "") = ref(this, "target_key_arn", subPath)
}
