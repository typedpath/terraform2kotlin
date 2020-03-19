package com.typedpath.terraform2kotlin.aws.schema

class aws_appautoscaling_scheduled_action(val service_namespace : String, val name : String, val resource_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var scalable_dimension: String? = null
  var start_time: String? = null
  var end_time: String? = null
  var scalable_target_action: List<Scalable_target_action>? = null
  var schedule: String? = null
 


class Scalable_target_action() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var max_capacity: Int? = null
  var min_capacity: Int? = null
 

}
}
