package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dax_subnet_group(val name : String, val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
