package com.typedpath.terraform2kotlin.aws.schema

class aws_glacier_vault_lock(val vault_name : String, val complete_lock : Boolean, val policy : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ignore_deletion_error: Boolean? = null
 

}
