package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glacier_vault(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var access_policy: String? = null
  var notification: List<Notification>? = null
 


class Notification(val sns_topic : String, val events : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
