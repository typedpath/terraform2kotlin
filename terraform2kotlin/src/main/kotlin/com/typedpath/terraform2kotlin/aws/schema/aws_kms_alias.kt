package com.typedpath.terraform2kotlin.aws.schema

class aws_kms_alias(val target_key_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var name_prefix: String? = null
 

}
