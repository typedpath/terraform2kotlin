package com.typedpath.terraform2kotlin.aws.schema

class aws_ses_domain_mail_from(val domain : String, val mail_from_domain : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var behavior_on_mx_failure: String? = null
 

}