package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_region() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="data"
	  var name: String? = null
  var current: Boolean? = null
  var endpoint: String? = null
 

fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun currentRef(subPath: String = "") = ref(this, "current", subPath)
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
}
