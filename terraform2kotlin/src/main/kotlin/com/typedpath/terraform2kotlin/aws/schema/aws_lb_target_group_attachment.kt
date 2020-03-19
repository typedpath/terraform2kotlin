package com.typedpath.terraform2kotlin.aws.schema

class aws_lb_target_group_attachment(val target_group_arn : String, val target_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var port: Int? = null
  var availability_zone: String? = null
 

}
