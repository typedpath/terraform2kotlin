package com.typedpath.terraform2kotlin.aws.schema

class aws_backup_vault(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var kms_key_arn: String? = null
 

}
