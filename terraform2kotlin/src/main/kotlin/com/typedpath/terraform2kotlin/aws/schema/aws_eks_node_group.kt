package com.typedpath.terraform2kotlin.aws.schema

class aws_eks_node_group(val node_group_name: String, val node_role_arn: String, val cluster_name: String, val scaling_config: List<scaling_config>, val subnet_ids: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var disk_size: Int? = null
  var remote_access: List<remote_access>? = null
  var version: String? = null
  var ami_type: ami_type? = null
  var instance_types: List<String>? = null
  var labels: Map<String, String>? = null
  var release_version: String? = null
  var tags: Map<String, String>? = null

} 

enum class ami_type(val theValue: String ) {
	 AL2_x86_64 ("AL2_x86_64"), AL2_x86_64_GPU ("AL2_x86_64_GPU") ;
	override fun toString() = theValue
	}

class scaling_config(val min_size: Int, val desired_size: Int, val max_size: Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	
} 


class remote_access() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ec2_ssh_key: String? = null
  var source_security_group_ids: List<String>? = null

} 

