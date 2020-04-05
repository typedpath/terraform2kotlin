package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lb_target_group_attachment(val target_id : String, val target_group_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var port: Int? = null
 

}
