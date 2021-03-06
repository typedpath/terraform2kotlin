package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_event_subscription(val sns_topic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var tags: Map<String, String>? = null
  var source_ids: List<String>? = null
  var source_type: String? = null
  var event_categories: List<String>? = null
  var name: String? = null
  var name_prefix: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
