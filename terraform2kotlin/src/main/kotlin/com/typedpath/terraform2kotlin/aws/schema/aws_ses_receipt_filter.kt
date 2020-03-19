package com.typedpath.terraform2kotlin.aws.schema

class aws_ses_receipt_filter(val cidr : String, val policy : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
