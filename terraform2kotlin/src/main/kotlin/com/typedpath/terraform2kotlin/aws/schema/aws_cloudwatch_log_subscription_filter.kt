package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_log_subscription_filter(val log_group_name : String, val name : String, val destination_arn : String, val filter_pattern : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var role_arn: String? = null
  var distribution: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
