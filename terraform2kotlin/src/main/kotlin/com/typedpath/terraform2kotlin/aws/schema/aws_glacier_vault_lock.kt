package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glacier_vault_lock(val complete_lock : Boolean, val policy : String, val vault_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ignore_deletion_error: Boolean? = null
 

}
