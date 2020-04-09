package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_guardduty_detector() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enable: Boolean? = null
  var finding_publishing_frequency: String? = null
 

fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun service_role_arnRef(subPath: String = "") = ref(this, "service_role_arn", subPath)
fun finding_publishing_frequencyRef(subPath: String = "") = ref(this, "finding_publishing_frequency", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
