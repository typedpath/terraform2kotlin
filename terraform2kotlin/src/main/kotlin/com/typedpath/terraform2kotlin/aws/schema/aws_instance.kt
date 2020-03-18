package com.typedpath.terraform2kotlin.aws.schema

class aws_instance(val instance_type: String, val ami: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var network_interface: List<network_interface>? = null
  var volume_tags: Map<String, String>? = null
  var ebs_block_device: List<ebs_block_device>? = null
  var instance_initiated_shutdown_behavior: String? = null
  var hibernation: Boolean? = null
  var tags: Map<String, String>? = null
  var subnet_id: String? = null
  var security_groups: List<String>? = null
  var vpc_security_group_ids: List<String>? = null
  var disable_api_termination: Boolean? = null
  var ephemeral_block_device: List<ephemeral_block_device>? = null
  var associate_public_ip_address: Boolean? = null
  var availability_zone: String? = null
  var source_dest_check: Boolean? = null
  var user_data_base64: String? = null
  var iam_instance_profile: String? = null
  var placement_group: String? = null
  var host_id: String? = null
  var cpu_threads_per_core: Int? = null
  var key_name: String? = null
  var ebs_optimized: Boolean? = null
  var monitoring: Boolean? = null
  var tenancy: String? = null
  var credit_specification: List<credit_specification>? = null
  var get_password_data: Boolean? = null
  var ipv6_address_count: Int? = null
  var ipv6_addresses: List<String>? = null
  var root_block_device: List<root_block_device>? = null
  var private_ip: String? = null
  var user_data: String? = null
  var cpu_core_count: Int? = null

} 


class ebs_block_device(val device_name: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var iops: Int? = null
  var kms_key_id: String? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null

} 


class ephemeral_block_device(val device_name: String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var virtual_name: String? = null
  var no_device: Boolean? = null

} 


class credit_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cpu_credits: String? = null

} 


class root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var kms_key_id: String? = null
  var iops: Int? = null
  var volume_size: Int? = null

} 


class network_interface(val network_interface_id: String, val device_index: Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null

} 

