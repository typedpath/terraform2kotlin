package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_function(val runtime : Runtime, val function_name : String, val role : String, val handler : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var s3_key: String? = null
  var tags: Map<String, String>? = null
  var s3_object_version: String? = null
  var dead_letter_config: List<Dead_letter_config>? = null
  var kms_key_arn: String? = null
  var layers: List<String>? = null
  var reserved_concurrent_executions: Int? = null
  var tracing_config: List<Tracing_config>? = null
  var s3_bucket: String? = null
  var source_code_hash: String? = null
  var memory_size: Int? = null
  var timeout: Int? = null
  var publish: Boolean? = null
  var vpc_config: List<Vpc_config>? = null
  var filename: String? = null
  var environment: List<Environment>? = null
  var description: String? = null
 

enum class Runtime(val theValue: String ) {
	 dotnetcore1_0 ("dotnetcore1.0"), dotnetcore2_0 ("dotnetcore2.0"), dotnetcore2_1 ("dotnetcore2.1"), go1_x ("go1.x"), java8 ("java8"), java11 ("java11"), nodejs4_3 ("nodejs4.3"), nodejs4_3_edge ("nodejs4.3-edge"), nodejs6_10 ("nodejs6.10"), nodejs8_10 ("nodejs8.10"), nodejs10_x ("nodejs10.x"), nodejs12_x ("nodejs12.x"), provided ("provided"), python2_7 ("python2.7"), python3_6 ("python3.6"), python3_7 ("python3.7"), python3_8 ("python3.8"), ruby2_5 ("ruby2.5"), ruby2_7 ("ruby2.7") ;
	override fun toString() = theValue
	}

class Dead_letter_config(val target_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Tracing_config(val mode : Mode) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Mode(val theValue: String ) {
	 Active ("Active"), PassThrough ("PassThrough") ;
	override fun toString() = theValue
	}
}

class Vpc_config(val subnet_ids : List<String>, val security_group_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Environment() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var variables: Map<String, String>? = null
 

}
fun runtimeRef(subPath: String = "") = ref(this, "runtime", subPath)
fun timeoutRef(subPath: String = "") = ref(this, "timeout", subPath)
fun versionRef(subPath: String = "") = ref(this, "version", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun last_modifiedRef(subPath: String = "") = ref(this, "last_modified", subPath)
fun function_nameRef(subPath: String = "") = ref(this, "function_name", subPath)
fun reserved_concurrent_executionsRef(subPath: String = "") = ref(this, "reserved_concurrent_executions", subPath)
fun roleRef(subPath: String = "") = ref(this, "role", subPath)
fun tracing_configRef(subPath: String = "") = ref(this, "tracing_config", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun vpc_configRef(subPath: String = "") = ref(this, "vpc_config", subPath)
fun qualified_arnRef(subPath: String = "") = ref(this, "qualified_arn", subPath)
fun environmentRef(subPath: String = "") = ref(this, "environment", subPath)
fun kms_key_arnRef(subPath: String = "") = ref(this, "kms_key_arn", subPath)
fun qualifierRef(subPath: String = "") = ref(this, "qualifier", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun layersRef(subPath: String = "") = ref(this, "layers", subPath)
fun invoke_arnRef(subPath: String = "") = ref(this, "invoke_arn", subPath)
fun source_code_hashRef(subPath: String = "") = ref(this, "source_code_hash", subPath)
fun source_code_sizeRef(subPath: String = "") = ref(this, "source_code_size", subPath)
fun dead_letter_configRef(subPath: String = "") = ref(this, "dead_letter_config", subPath)
fun handlerRef(subPath: String = "") = ref(this, "handler", subPath)
fun memory_sizeRef(subPath: String = "") = ref(this, "memory_size", subPath)
}
