package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_eks_cluster(val role_arn : String, val vpc_config : List<Vpc_config>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var version: String? = null
  var enabled_cluster_log_types: List<Enabled_cluster_log_types>? = null
  var encryption_config: List<Encryption_config>? = null
 

enum class Enabled_cluster_log_types(val theValue: String ) {
	 api ("api"), audit ("audit"), authenticator ("authenticator"), controllerManager ("controllerManager"), scheduler ("scheduler") ;
	override fun toString() = theValue
	}

class Vpc_config(val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var endpoint_private_access: Boolean? = null
  var endpoint_public_access: Boolean? = null
  var security_group_ids: List<String>? = null
  var public_access_cidrs: List<String>? = null
 

}

class Encryption_config(val resources : List<Resources>, val provider : List<Provider>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Resources(val theValue: String ) {
	 secrets ("secrets") ;
	override fun toString() = theValue
	}

class Provider(val key_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun certificate_authorityRef(subPath: String = "") = ref(this, "certificate_authority", subPath)
fun created_atRef(subPath: String = "") = ref(this, "created_at", subPath)
fun enabled_cluster_log_typesRef(subPath: String = "") = ref(this, "enabled_cluster_log_types", subPath)
fun identityRef(subPath: String = "") = ref(this, "identity", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun platform_versionRef(subPath: String = "") = ref(this, "platform_version", subPath)
fun role_arnRef(subPath: String = "") = ref(this, "role_arn", subPath)
fun versionRef(subPath: String = "") = ref(this, "version", subPath)
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun vpc_configRef(subPath: String = "") = ref(this, "vpc_config", subPath)
}
