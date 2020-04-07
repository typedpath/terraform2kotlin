package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ram_resource_share(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var allow_external_principals: Boolean? = null
  var tags: Map<String, String>? = null
 

fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun resource_ownerRef(subPath: String = "") = ref(this, "resource_owner", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
}
