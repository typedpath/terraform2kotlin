package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codecommit_repository(val repository_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
  var default_branch: String? = null
 

fun repository_nameRef(subPath: String = "") = ref(this, "repository_name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun repository_idRef(subPath: String = "") = ref(this, "repository_id", subPath)
fun clone_url_httpRef(subPath: String = "") = ref(this, "clone_url_http", subPath)
fun clone_url_sshRef(subPath: String = "") = ref(this, "clone_url_ssh", subPath)
}
