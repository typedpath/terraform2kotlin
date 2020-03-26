package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_metric(val name : String, val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var filter: List<Filter>? = null
 


class Filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tags: Map<String, String>? = null
  var prefix: String? = null
 

}
}
