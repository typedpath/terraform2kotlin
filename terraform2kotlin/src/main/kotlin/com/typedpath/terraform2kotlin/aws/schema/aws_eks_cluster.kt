package com.typedpath.terraform2kotlin.aws.schema

class aws_eks_cluster(val role_arn: String, val vpc_config: List<vpc_config>, val name: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var version: String? = null
  var enabled_cluster_log_types: List<enabled_cluster_log_types>? = null
  var tags: Map<String, String>? = null
  var encryption_config: List<encryption_config>? = null

} 

enum class enabled_cluster_log_types(val theValue: String ) {
	 api ("api"), audit ("audit"), authenticator ("authenticator"), controllerManager ("controllerManager"), scheduler ("scheduler") ;
	override fun toString() = theValue
	}

class vpc_config(val subnet_ids: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var endpoint_private_access: Boolean? = null
  var endpoint_public_access: Boolean? = null
  var security_group_ids: List<String>? = null
  var public_access_cidrs: List<String>? = null

} 


class encryption_config(val resources: List<resources>, val provider: List<provider>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	
} 

enum class resources(val theValue: String ) {
	 secrets ("secrets") ;
	override fun toString() = theValue
	}

class provider(val key_arn: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	
} 

