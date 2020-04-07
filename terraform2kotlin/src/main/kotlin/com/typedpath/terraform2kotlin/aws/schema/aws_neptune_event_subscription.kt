package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_neptune_event_subscription(val sns_topic_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var event_categories: List<String>? = null
  var source_ids: List<String>? = null
  var enabled: Boolean? = null
  var name: String? = null
  var name_prefix: String? = null
  var tags: Map<String, String>? = null
  var source_type: String? = null
 

}
