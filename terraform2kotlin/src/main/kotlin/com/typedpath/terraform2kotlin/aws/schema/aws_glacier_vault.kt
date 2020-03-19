package com.typedpath.terraform2kotlin.aws.schema

class aws_glacier_vault(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var access_policy: String? = null
  var notification: List<Notification>? = null
 


class Notification(val events : List<String>, val sns_topic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
