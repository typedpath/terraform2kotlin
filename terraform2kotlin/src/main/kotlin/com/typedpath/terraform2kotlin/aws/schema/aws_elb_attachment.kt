package com.typedpath.terraform2kotlin.aws.schema

class aws_elb_attachment(val instance : String, val elb : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
