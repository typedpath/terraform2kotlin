package com.typedpath.terraform2kotlin.aws.schema

class aws_eks_cluster(val role_arn : String, val vpc_config : List<Vpc_config>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var version: String? = null
  var tags: Map<String, String>? = null
  var enabled_cluster_log_types: List<Enabled_cluster_log_types>? = null
  var encryption_config: List<Encryption_config>? = null
 

enum class Enabled_cluster_log_types(val theValue: String ) {
	 api ("api"), audit ("audit"), authenticator ("authenticator"), controllerManager ("controllerManager"), scheduler ("scheduler") ;
	override fun toString() = theValue
	}

class Vpc_config(val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var endpoint_public_access: Boolean? = null
  var security_group_ids: List<String>? = null
  var public_access_cidrs: List<String>? = null
  var endpoint_private_access: Boolean? = null
 

}

class Encryption_config(val provider : List<Provider>, val resources : List<Resources>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Resources(val theValue: String ) {
	 secrets ("secrets") ;
	override fun toString() = theValue
	}

class Provider(val key_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
