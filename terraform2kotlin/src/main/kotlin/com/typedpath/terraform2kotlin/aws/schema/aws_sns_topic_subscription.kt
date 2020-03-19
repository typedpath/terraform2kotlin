package com.typedpath.terraform2kotlin.aws.schema

class aws_sns_topic_subscription(val protocol : Protocol, val endpoint : String, val topic_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var raw_message_delivery: Boolean? = null
  var filter_policy: String? = null
  var endpoint_auto_confirms: Boolean? = null
  var confirmation_timeout_in_minutes: Int? = null
  var delivery_policy: String? = null
 

enum class Protocol(val theValue: String ) {
	 application ("application"), http ("http"), https ("https"), lambda ("lambda"), sms ("sms"), sqs ("sqs") ;
	override fun toString() = theValue
	}
}
