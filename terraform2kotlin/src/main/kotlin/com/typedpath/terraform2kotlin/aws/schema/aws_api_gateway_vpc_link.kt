package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_vpc_link(val target_arns : List<String>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 

fun status_messageRef(subPath: String = "") = ref(this, "status_message", subPath)
fun target_arnsRef(subPath: String = "") = ref(this, "target_arns", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
}
