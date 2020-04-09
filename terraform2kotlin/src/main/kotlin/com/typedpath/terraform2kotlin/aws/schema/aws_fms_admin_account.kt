package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_fms_admin_account() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var account_id: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
