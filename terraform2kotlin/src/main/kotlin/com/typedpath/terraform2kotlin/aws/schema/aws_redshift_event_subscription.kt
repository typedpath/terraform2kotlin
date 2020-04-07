package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_redshift_event_subscription(val name : String, val sns_topic_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var severity: String? = null
  var tags: Map<String, String>? = null
  var event_categories: List<String>? = null
  var enabled: Boolean? = null
  var source_ids: List<String>? = null
  var source_type: String? = null
 

}
