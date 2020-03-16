package com.typedpath.terraform2kotlin.aws.schema

class aws_eks_node_group(val scaling_config: List<scaling_config>, val cluster_name: String, val node_group_name: String, val node_role_arn: String, val subnet_ids: List<String>) :  com.typedpath.terraform2kotlin.Resource() {
  var ami_type: String? = null
  var instance_types: List<String>? = null
  var disk_size: Int? = null
  var remote_access: List<remote_access>? = null
  var version: String? = null
  var labels: Map<String, String>? = null
  var release_version: String? = null
  var tags: Map<String, String>? = null

} 


class scaling_config(val max_size: Int, val min_size: Int, val desired_size: Int) :  com.typedpath.terraform2kotlin.Resource() {

} 


class remote_access() :  com.typedpath.terraform2kotlin.Resource() {
  var ec2_ssh_key: String? = null
  var source_security_group_ids: List<String>? = null

} 

