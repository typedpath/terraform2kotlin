package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appautoscaling_target(val scalable_dimension : String, val service_namespace : String, val max_capacity : Int, val min_capacity : Int, val resource_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var role_arn: String? = null
 

}
