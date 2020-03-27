package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_servicequotas_service_quota(val quota_code : String, val service_code : String, val value : Float) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

fun adjustableRef(subPath: String = "") = ref(this, "adjustable", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun quota_nameRef(subPath: String = "") = ref(this, "quota_name", subPath)
fun service_codeRef(subPath: String = "") = ref(this, "service_code", subPath)
fun default_valueRef(subPath: String = "") = ref(this, "default_value", subPath)
fun global_quotaRef(subPath: String = "") = ref(this, "global_quota", subPath)
fun quota_codeRef(subPath: String = "") = ref(this, "quota_code", subPath)
fun service_nameRef(subPath: String = "") = ref(this, "service_name", subPath)
fun valueRef(subPath: String = "") = ref(this, "value", subPath)
}
