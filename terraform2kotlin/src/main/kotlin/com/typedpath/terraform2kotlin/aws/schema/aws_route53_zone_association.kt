package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route53_zone_association(val zone_id : String, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_region: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
