package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_sns_topic_subscription(val endpoint : String, val topic_arn : String, val protocol : Protocol) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var endpoint_auto_confirms: Boolean? = null
  var confirmation_timeout_in_minutes: Int? = null
  var delivery_policy: String? = null
  var raw_message_delivery: Boolean? = null
  var filter_policy: String? = null
 

enum class Protocol(val theValue: String ) {
	 application ("application"), http ("http"), https ("https"), lambda ("lambda"), sms ("sms"), sqs ("sqs") ;
	override fun toString() = theValue
	}
}
