package com.typedpath.terraform2kotlin.aws.schema

class aws_instance(val instance_type: String, val ami: String) :  com.typedpath.terraform2kotlin.Resource() {
  var ipv6_addresses: List<String>? = null
  var ephemeral_block_device: List<ephemeral_block_device>? = null
  var user_data: String? = null
  var vpc_security_group_ids: List<String>? = null
  var instance_initiated_shutdown_behavior: String? = null
  var user_data_base64: String? = null
  var hibernation: Boolean? = null
  var cpu_core_count: Int? = null
  var iam_instance_profile: String? = null
  var ebs_block_device: List<ebs_block_device>? = null
  var placement_group: String? = null
  var subnet_id: String? = null
  var private_ip: String? = null
  var monitoring: Boolean? = null
  var disable_api_termination: Boolean? = null
  var tenancy: String? = null
  var tags: Map<String, String>? = null
  var availability_zone: String? = null
  var get_password_data: Boolean? = null
  var source_dest_check: Boolean? = null
  var root_block_device: List<root_block_device>? = null
  var associate_public_ip_address: Boolean? = null
  var key_name: String? = null
  var ipv6_address_count: Int? = null
  var credit_specification: List<credit_specification>? = null
  var cpu_threads_per_core: Int? = null
  var volume_tags: Map<String, String>? = null
  var security_groups: List<String>? = null
  var network_interface: List<network_interface>? = null
  var ebs_optimized: Boolean? = null
  var host_id: String? = null

} 


class ephemeral_block_device(val device_name: String) :  com.typedpath.terraform2kotlin.Resource() {
  var virtual_name: String? = null
  var no_device: Boolean? = null

} 


class ebs_block_device(val device_name: String) :  com.typedpath.terraform2kotlin.Resource() {
  var snapshot_id: String? = null
  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var volume_type: String? = null
  var iops: Int? = null
  var kms_key_id: String? = null
  var volume_size: Int? = null

} 


class root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
  var kms_key_id: String? = null
  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null

} 


class credit_specification() :  com.typedpath.terraform2kotlin.Resource() {
  var cpu_credits: String? = null

} 


class network_interface(val network_interface_id: String, val device_index: Int) :  com.typedpath.terraform2kotlin.Resource() {
  var delete_on_termination: Boolean? = null

} 

