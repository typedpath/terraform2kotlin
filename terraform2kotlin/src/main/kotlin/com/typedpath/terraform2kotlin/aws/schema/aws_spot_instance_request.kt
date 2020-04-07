package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_spot_instance_request(val ami : String, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var iam_instance_profile: String? = null
  var valid_until: String? = null
  var network_interface: List<Network_interface>? = null
  var user_data_base64: String? = null
  var vpc_security_group_ids: List<String>? = null
  var tenancy: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var key_name: String? = null
  var subnet_id: String? = null
  var source_dest_check: Boolean? = null
  var monitoring: Boolean? = null
  var ipv6_addresses: List<String>? = null
  var valid_from: String? = null
  var availability_zone: String? = null
  var ipv6_address_count: Int? = null
  var spot_type: String? = null
  var launch_group: String? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var root_block_device: List<Root_block_device>? = null
  var wait_for_fulfillment: Boolean? = null
  var hibernation: Boolean? = null
  var cpu_threads_per_core: Int? = null
  var tags: Map<String, String>? = null
  var instance_initiated_shutdown_behavior: String? = null
  var cpu_core_count: Int? = null
  var block_duration_minutes: Int? = null
  var instance_interruption_behaviour: Instance_interruption_behaviour? = null
  var placement_group: String? = null
  var user_data: String? = null
  var security_groups: List<String>? = null
  var private_ip: String? = null
  var disable_api_termination: Boolean? = null
  var host_id: String? = null
  var get_password_data: Boolean? = null
  var volume_tags: Map<String, String>? = null
  var spot_price: String? = null
  var credit_specification: List<Credit_specification>? = null
  var associate_public_ip_address: Boolean? = null
  var ebs_optimized: Boolean? = null
 

enum class Instance_interruption_behaviour(val theValue: String ) {
	 terminate ("terminate"), stop ("stop"), hibernate ("hibernate") ;
	override fun toString() = theValue
	}

class Network_interface(val network_interface_id : String, val device_index : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
  var iops: Int? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var encrypted: Boolean? = null
  var kms_key_id: String? = null
  var volume_type: String? = null
 

}

class Ephemeral_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var virtual_name: String? = null
  var no_device: Boolean? = null
 

}

class Root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var kms_key_id: String? = null
  var iops: Int? = null
  var volume_size: Int? = null
 

}

class Credit_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cpu_credits: String? = null
 

}
}
