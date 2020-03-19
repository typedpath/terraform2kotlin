package com.typedpath.terraform2kotlin.aws.schema

class aws_ses_template(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var html: String? = null
  var subject: String? = null
  var text: String? = null
 

}
