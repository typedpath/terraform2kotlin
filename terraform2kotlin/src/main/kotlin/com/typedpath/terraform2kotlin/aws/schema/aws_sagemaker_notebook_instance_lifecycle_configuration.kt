package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sagemaker_notebook_instance_lifecycle_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var on_create: String? = null
  var on_start: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
