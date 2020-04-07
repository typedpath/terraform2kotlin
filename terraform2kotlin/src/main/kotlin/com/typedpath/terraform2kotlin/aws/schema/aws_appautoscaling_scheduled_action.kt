package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appautoscaling_scheduled_action(val name : String, val service_namespace : String, val resource_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var start_time: String? = null
  var end_time: String? = null
  var scalable_dimension: String? = null
  var scalable_target_action: List<Scalable_target_action>? = null
  var schedule: String? = null
 


class Scalable_target_action() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var min_capacity: Int? = null
  var max_capacity: Int? = null
 

}
}
