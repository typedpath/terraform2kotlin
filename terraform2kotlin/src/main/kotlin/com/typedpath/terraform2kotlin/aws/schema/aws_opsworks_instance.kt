package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_opsworks_instance(val layer_ids : List<String>, val stack_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var reported_agent_version: String? = null
  var private_dns: String? = null
  var platform: String? = null
  var public_ip: String? = null
  var ssh_host_dsa_key_fingerprint: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var infrastructure_class: String? = null
  var install_updates_on_boot: Boolean? = null
  var private_ip: String? = null
  var auto_scaling_type: Auto_scaling_type? = null
  var instance_profile_arn: String? = null
  var registered_by: String? = null
  var ssh_key_name: String? = null
  var root_block_device: List<Root_block_device>? = null
  var hostname: String? = null
  var ami_id: String? = null
  var created_at: String? = null
  var delete_eip: Boolean? = null
  var ecs_cluster_arn: String? = null
  var public_dns: String? = null
  var reported_os_family: String? = null
  var state: State? = null
  var agent_version: String? = null
  var ebs_optimized: Boolean? = null
  var instance_type: String? = null
  var status: String? = null
  var tenancy: Tenancy? = null
  var delete_ebs: Boolean? = null
  var os: String? = null
  var reported_os_name: String? = null
  var root_device_type: Root_device_type? = null
  var root_device_volume_id: String? = null
  var ssh_host_rsa_key_fingerprint: String? = null
  var subnet_id: String? = null
  var virtualization_type: Virtualization_type? = null
  var last_service_error_id: String? = null
  var availability_zone: String? = null
  var elastic_ip: String? = null
  var reported_os_version: String? = null
  var security_group_ids: List<String>? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var architecture: Architecture? = null
 

enum class Auto_scaling_type(val theValue: String ) {
	 load ("load"), timer ("timer") ;
	override fun toString() = theValue
	}
enum class State(val theValue: String ) {
	 running ("running"), stopped ("stopped") ;
	override fun toString() = theValue
	}
enum class Tenancy(val theValue: String ) {
	 dedicated ("dedicated"), default ("default"), host ("host") ;
	override fun toString() = theValue
	}
enum class Root_device_type(val theValue: String ) {
	 ebs ("ebs"), instance_store ("instance-store") ;
	override fun toString() = theValue
	}
enum class Virtualization_type(val theValue: String ) {
	 paravirtual ("paravirtual"), hvm ("hvm") ;
	override fun toString() = theValue
	}
enum class Architecture(val theValue: String ) {
	 x86_64 ("x86_64"), i386 ("i386") ;
	override fun toString() = theValue
	}

class Root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
 

}

class Ephemeral_block_device(val device_name : String, val virtual_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
