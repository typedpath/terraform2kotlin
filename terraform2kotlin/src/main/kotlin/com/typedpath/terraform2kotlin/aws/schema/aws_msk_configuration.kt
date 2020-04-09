package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_msk_configuration(val name : String, val server_properties : String, val kafka_versions : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
 

fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun kafka_versionsRef(subPath: String = "") = ref(this, "kafka_versions", subPath)
fun latest_revisionRef(subPath: String = "") = ref(this, "latest_revision", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun server_propertiesRef(subPath: String = "") = ref(this, "server_properties", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
