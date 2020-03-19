package com.typedpath.terraform2kotlin.aws.schema

class aws_db_event_subscription(val sns_topic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var source_type: String? = null
  var enabled: Boolean? = null
  var name: String? = null
  var event_categories: List<String>? = null
  var source_ids: List<String>? = null
  var tags: Map<String, String>? = null
 

}
