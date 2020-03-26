package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_eks_node_group(val subnet_ids : List<String>, val node_group_name : String, val cluster_name : String, val node_role_arn : String, val scaling_config : List<Scaling_config>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var version: String? = null
  var labels: Map<String, String>? = null
  var remote_access: List<Remote_access>? = null
  var ami_type: Ami_type? = null
  var disk_size: Int? = null
  var release_version: String? = null
  var instance_types: List<String>? = null
  var tags: Map<String, String>? = null
 

enum class Ami_type(val theValue: String ) {
	 AL2_x86_64 ("AL2_x86_64"), AL2_x86_64_GPU ("AL2_x86_64_GPU") ;
	override fun toString() = theValue
	}

class Scaling_config(val min_size : Int, val desired_size : Int, val max_size : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Remote_access() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var source_security_group_ids: List<String>? = null
  var ec2_ssh_key: String? = null
 

}
}
