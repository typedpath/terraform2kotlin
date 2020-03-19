package com.typedpath.terraform2kotlin.aws.schema

class aws_guardduty_member(val detector_id : String, val email : String, val account_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var invitation_message: String? = null
  var invite: Boolean? = null
  var disable_email_notification: Boolean? = null
 

}
