package com.typedpath.terraform2kotlin.aws.schema

class aws_iot_certificate(val active : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var csr: String? = null
 

}
