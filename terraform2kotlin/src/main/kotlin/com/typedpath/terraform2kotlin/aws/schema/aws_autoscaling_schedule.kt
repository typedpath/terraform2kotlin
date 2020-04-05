package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_autoscaling_schedule(val scheduled_action_name : String, val autoscaling_group_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var end_time: String? = null
  var recurrence: String? = null
  var min_size: Int? = null
  var max_size: Int? = null
  var desired_capacity: Int? = null
  var start_time: String? = null
 

}
