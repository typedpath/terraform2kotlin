package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_inspector_assessment_target(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var resource_group_arn: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
