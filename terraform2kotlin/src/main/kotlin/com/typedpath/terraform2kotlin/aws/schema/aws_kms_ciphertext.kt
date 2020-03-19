package com.typedpath.terraform2kotlin.aws.schema

class aws_kms_ciphertext(val key_id : String, val plaintext : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var context: Map<String, String>? = null
 

}
