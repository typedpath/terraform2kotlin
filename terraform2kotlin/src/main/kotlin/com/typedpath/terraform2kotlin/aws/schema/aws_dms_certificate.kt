package com.typedpath.terraform2kotlin.aws.schema

class aws_dms_certificate(val certificate_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var certificate_pem: String? = null
  var certificate_wallet: String? = null
 

}
