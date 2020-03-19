package com.typedpath.terraform2kotlin.aws.schema

class aws_acm_certificate_validation(val certificate_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var validation_record_fqdns: List<String>? = null
 

}
