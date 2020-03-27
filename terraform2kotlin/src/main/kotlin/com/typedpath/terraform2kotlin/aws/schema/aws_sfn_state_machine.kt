package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sfn_state_machine(val definition : String, val name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun role_arnRef(subPath: String = "") = ref(this, "role_arn", subPath)
fun definitionRef(subPath: String = "") = ref(this, "definition", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun creation_dateRef(subPath: String = "") = ref(this, "creation_date", subPath)
}
