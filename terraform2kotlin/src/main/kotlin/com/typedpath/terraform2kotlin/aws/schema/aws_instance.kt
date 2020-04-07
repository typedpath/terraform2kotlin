package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_instance(val instance_type : String, val ami : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var get_password_data: Boolean? = null
  var instance_initiated_shutdown_behavior: String? = null
  var tenancy: String? = null
  var cpu_core_count: Int? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var subnet_id: String? = null
  var iam_instance_profile: String? = null
  var tags: Map<String, String>? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var key_name: String? = null
  var disable_api_termination: Boolean? = null
  var source_dest_check: Boolean? = null
  var security_groups: List<String>? = null
  var ipv6_addresses: List<String>? = null
  var host_id: String? = null
  var credit_specification: List<Credit_specification>? = null
  var placement_group: String? = null
  var private_ip: String? = null
  var vpc_security_group_ids: List<String>? = null
  var network_interface: List<Network_interface>? = null
  var root_block_device: List<Root_block_device>? = null
  var availability_zone: String? = null
  var user_data_base64: String? = null
  var ipv6_address_count: Int? = null
  var cpu_threads_per_core: Int? = null
  var volume_tags: Map<String, String>? = null
  var hibernation: Boolean? = null
  var associate_public_ip_address: Boolean? = null
  var user_data: String? = null
  var ebs_optimized: Boolean? = null
  var monitoring: Boolean? = null
 


class Credit_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cpu_credits: String? = null
 

}

class Network_interface(val network_interface_id : String, val device_index : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
 

}

class Root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encrypted: Boolean? = null
  var kms_key_id: String? = null
  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
 

}

class Ephemeral_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var virtual_name: String? = null
  var no_device: Boolean? = null
 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var iops: Int? = null
  var kms_key_id: String? = null
 

}
fun ephemeral_block_deviceRef(subPath: String = "") = ref(this, "ephemeral_block_device", subPath)
fun password_dataRef(subPath: String = "") = ref(this, "password_data", subPath)
fun credit_specificationRef(subPath: String = "") = ref(this, "credit_specification", subPath)
fun disable_api_terminationRef(subPath: String = "") = ref(this, "disable_api_termination", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun instance_tagsRef(subPath: String = "") = ref(this, "instance_tags", subPath)
fun tenancyRef(subPath: String = "") = ref(this, "tenancy", subPath)
fun public_dnsRef(subPath: String = "") = ref(this, "public_dns", subPath)
fun subnet_idRef(subPath: String = "") = ref(this, "subnet_id", subPath)
fun monitoringRef(subPath: String = "") = ref(this, "monitoring", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun instance_idRef(subPath: String = "") = ref(this, "instance_id", subPath)
fun instance_typeRef(subPath: String = "") = ref(this, "instance_type", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun user_dataRef(subPath: String = "") = ref(this, "user_data", subPath)
fun amiRef(subPath: String = "") = ref(this, "ami", subPath)
fun public_ipRef(subPath: String = "") = ref(this, "public_ip", subPath)
fun private_dnsRef(subPath: String = "") = ref(this, "private_dns", subPath)
fun network_interface_idRef(subPath: String = "") = ref(this, "network_interface_id", subPath)
fun associate_public_ip_addressRef(subPath: String = "") = ref(this, "associate_public_ip_address", subPath)
fun get_user_dataRef(subPath: String = "") = ref(this, "get_user_data", subPath)
fun source_dest_checkRef(subPath: String = "") = ref(this, "source_dest_check", subPath)
fun user_data_base64Ref(subPath: String = "") = ref(this, "user_data_base64", subPath)
fun vpc_security_group_idsRef(subPath: String = "") = ref(this, "vpc_security_group_ids", subPath)
fun placement_groupRef(subPath: String = "") = ref(this, "placement_group", subPath)
fun iam_instance_profileRef(subPath: String = "") = ref(this, "iam_instance_profile", subPath)
fun ebs_optimizedRef(subPath: String = "") = ref(this, "ebs_optimized", subPath)
fun ebs_block_deviceRef(subPath: String = "") = ref(this, "ebs_block_device", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun instance_stateRef(subPath: String = "") = ref(this, "instance_state", subPath)
fun host_idRef(subPath: String = "") = ref(this, "host_id", subPath)
fun key_nameRef(subPath: String = "") = ref(this, "key_name", subPath)
fun get_password_dataRef(subPath: String = "") = ref(this, "get_password_data", subPath)
fun private_ipRef(subPath: String = "") = ref(this, "private_ip", subPath)
fun root_block_deviceRef(subPath: String = "") = ref(this, "root_block_device", subPath)
}
