package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_internet_gateway() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_id: String? = null
  var tags: Map<String, String>? = null
 

fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun attachmentsRef(subPath: String = "") = ref(this, "attachments", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun internet_gateway_idRef(subPath: String = "") = ref(this, "internet_gateway_id", subPath)
}
