package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iam_server_certificate(val certificate_body : String, val private_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var arn: String? = null
  var certificate_chain: String? = null
  var path: String? = null
  var name: String? = null
 

fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun pathRef(subPath: String = "") = ref(this, "path", subPath)
fun expiration_dateRef(subPath: String = "") = ref(this, "expiration_date", subPath)
fun upload_dateRef(subPath: String = "") = ref(this, "upload_date", subPath)
fun certificate_bodyRef(subPath: String = "") = ref(this, "certificate_body", subPath)
fun name_prefixRef(subPath: String = "") = ref(this, "name_prefix", subPath)
fun path_prefixRef(subPath: String = "") = ref(this, "path_prefix", subPath)
fun latestRef(subPath: String = "") = ref(this, "latest", subPath)
fun certificate_chainRef(subPath: String = "") = ref(this, "certificate_chain", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
}
