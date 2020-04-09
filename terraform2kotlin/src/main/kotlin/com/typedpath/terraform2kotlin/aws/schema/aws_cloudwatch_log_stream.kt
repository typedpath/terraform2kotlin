package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_log_stream(val name : String, val log_group_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
