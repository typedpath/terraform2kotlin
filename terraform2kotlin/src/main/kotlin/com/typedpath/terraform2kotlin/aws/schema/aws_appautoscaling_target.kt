package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appautoscaling_target(val max_capacity : Int, val min_capacity : Int, val resource_id : String, val scalable_dimension : String, val service_namespace : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var role_arn: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
