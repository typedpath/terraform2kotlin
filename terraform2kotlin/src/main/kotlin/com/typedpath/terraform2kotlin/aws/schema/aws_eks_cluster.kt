package com.typedpath.terraform2kotlin.aws.schema

class aws_eks_cluster(val role_arn: String, val vpc_config: List<vpc_config>, val name: String) :  com.typedpath.terraform2kotlin.Resource() {
  var encryption_config: List<encryption_config>? = null
  var tags: Map<String, String>? = null
  var version: String? = null
  var enabled_cluster_log_types: List<String>? = null

} 


class vpc_config(val subnet_ids: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
  var endpoint_private_access: Boolean? = null
  var endpoint_public_access: Boolean? = null
  var security_group_ids: List<String>? = null
  var public_access_cidrs: List<String>? = null

} 


class encryption_config(val provider: List<provider>, val resources: List<String>) :  com.typedpath.terraform2kotlin.Resource() {

} 


class provider(val key_arn: String) :  com.typedpath.terraform2kotlin.Resource() {

} 

