package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_s3_bucket_notification(val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var topic: List<Topic>? = null
  var queue: List<Queue>? = null
  var lambda_function: List<Lambda_function>? = null
 


class Topic(val topic_arn : String, val events : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var filter_prefix: String? = null
  var filter_suffix: String? = null
  var id: String? = null
 

}

class Queue(val queue_arn : String, val events : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var id: String? = null
  var filter_prefix: String? = null
  var filter_suffix: String? = null
 

}

class Lambda_function(val events : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var filter_prefix: String? = null
  var filter_suffix: String? = null
  var lambda_function_arn: String? = null
  var id: String? = null
 

}
}
