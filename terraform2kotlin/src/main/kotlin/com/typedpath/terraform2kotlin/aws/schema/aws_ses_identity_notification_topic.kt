package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ses_identity_notification_topic(val notification_type : Notification_type, val identity : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var topic_arn: String? = null
  var include_original_headers: Boolean? = null
 

enum class Notification_type(val theValue: String ) {
	 Bounce ("Bounce"), Complaint ("Complaint"), Delivery ("Delivery") ;
	override fun toString() = theValue
	}
}
