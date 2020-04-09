package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glacier_vault(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var access_policy: String? = null
  var notification: List<Notification>? = null
  var tags: Map<String, String>? = null
 


class Notification(val events : List<String>, val sns_topic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
