package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lb_target_group_attachment(val target_group_arn : String, val target_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var port: Int? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
