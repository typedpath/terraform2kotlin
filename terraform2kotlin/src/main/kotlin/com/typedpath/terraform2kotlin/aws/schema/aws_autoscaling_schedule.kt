package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_autoscaling_schedule(val autoscaling_group_name : String, val scheduled_action_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var start_time: String? = null
  var desired_capacity: Int? = null
  var end_time: String? = null
  var recurrence: String? = null
  var min_size: Int? = null
  var max_size: Int? = null
 

}
