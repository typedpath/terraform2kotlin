package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudfront_origin_access_identity() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var comment: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
