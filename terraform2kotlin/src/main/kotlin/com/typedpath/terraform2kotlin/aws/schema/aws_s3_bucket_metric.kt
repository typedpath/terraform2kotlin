package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_metric(val bucket : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var filter: List<Filter>? = null
 


class Filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var prefix: String? = null
  var tags: Map<String, String>? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
