package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ebs_encryption_by_default() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
 

fun enabledRef(subPath: String = "") = ref(this, "enabled", subPath)
}
