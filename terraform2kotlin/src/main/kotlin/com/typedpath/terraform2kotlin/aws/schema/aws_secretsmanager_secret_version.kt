package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_secretsmanager_secret_version(val secret_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var secret_binary: String? = null
  var version_stages: List<String>? = null
  var secret_string: String? = null
 

fun secret_stringRef(subPath: String = "") = ref(this, "secret_string", subPath)
fun secret_binaryRef(subPath: String = "") = ref(this, "secret_binary", subPath)
fun version_idRef(subPath: String = "") = ref(this, "version_id", subPath)
fun version_stageRef(subPath: String = "") = ref(this, "version_stage", subPath)
fun version_stagesRef(subPath: String = "") = ref(this, "version_stages", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun secret_idRef(subPath: String = "") = ref(this, "secret_id", subPath)
}
