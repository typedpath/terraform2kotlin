package com.typedpath.terraform2kotlin.aws.schema

class aws_guardduty_invite_accepter(val detector_id : String, val master_account_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}