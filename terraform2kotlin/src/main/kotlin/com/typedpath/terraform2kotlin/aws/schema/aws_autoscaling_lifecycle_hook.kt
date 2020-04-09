package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_autoscaling_lifecycle_hook(val lifecycle_transition : String, val name : String, val autoscaling_group_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var notification_metadata: String? = null
  var notification_target_arn: String? = null
  var role_arn: String? = null
  var default_result: String? = null
  var heartbeat_timeout: Int? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
