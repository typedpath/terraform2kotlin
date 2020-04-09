package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_subnet(val availability_zone : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var map_public_ip_on_launch: Boolean? = null
  var tags: Map<String, String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
