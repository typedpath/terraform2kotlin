package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_alias(val function_name : String, val function_version : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var routing_config: List<Routing_config>? = null
  var description: String? = null
 


class Routing_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var additional_version_weights: Map<String, String>? = null
 

}
fun function_nameRef(subPath: String = "") = ref(this, "function_name", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun invoke_arnRef(subPath: String = "") = ref(this, "invoke_arn", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun function_versionRef(subPath: String = "") = ref(this, "function_version", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
