package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_guardduty_member(val account_id : String, val detector_id : String, val email : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var invite: Boolean? = null
  var disable_email_notification: Boolean? = null
  var invitation_message: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
