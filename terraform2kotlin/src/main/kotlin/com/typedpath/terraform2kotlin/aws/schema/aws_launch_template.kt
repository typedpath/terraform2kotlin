package com.typedpath.terraform2kotlin.aws.schema

class aws_launch_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var instance_type: String? = null
  var tag_specifications: List<Tag_specifications>? = null
  var user_data: String? = null
  var instance_initiated_shutdown_behavior: Instance_initiated_shutdown_behavior? = null
  var key_name: String? = null
  var monitoring: List<Monitoring>? = null
  var network_interfaces: List<Network_interfaces>? = null
  var name_prefix: String? = null
  var block_device_mappings: List<Block_device_mappings>? = null
  var ebs_optimized: Ebs_optimized? = null
  var description: String? = null
  var disable_api_termination: Boolean? = null
  var kernel_id: String? = null
  var vpc_security_group_ids: List<String>? = null
  var name: String? = null
  var credit_specification: List<Credit_specification>? = null
  var placement: List<Placement>? = null
  var tags: Map<String, String>? = null
  var cpu_options: List<Cpu_options>? = null
  var license_specification: List<License_specification>? = null
  var capacity_reservation_specification: List<Capacity_reservation_specification>? = null
  var elastic_gpu_specifications: List<Elastic_gpu_specifications>? = null
  var instance_market_options: List<Instance_market_options>? = null
  var image_id: String? = null
  var ram_disk_id: String? = null
  var security_group_names: List<String>? = null
  var elastic_inference_accelerator: List<Elastic_inference_accelerator>? = null
  var iam_instance_profile: List<Iam_instance_profile>? = null
 

enum class Instance_initiated_shutdown_behavior(val theValue: String ) {
	 stop ("stop"), terminate ("terminate") ;
	override fun toString() = theValue
	}
enum class Ebs_optimized(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}

class Network_interfaces() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ipv6_addresses: List<String>? = null
  var network_interface_id: String? = null
  var subnet_id: String? = null
  var delete_on_termination: Boolean? = null
  var description: String? = null
  var security_groups: List<String>? = null
  var ipv6_address_count: Int? = null
  var ipv4_address_count: Int? = null
  var associate_public_ip_address: Associate_public_ip_address? = null
  var device_index: Int? = null
  var private_ip_address: String? = null
  var ipv4_addresses: List<String>? = null
 

enum class Associate_public_ip_address(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}
}

class Block_device_mappings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var device_name: String? = null
  var no_device: String? = null
  var virtual_name: String? = null
  var ebs: List<Ebs>? = null
 


class Ebs() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_id: String? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Delete_on_termination? = null
  var encrypted: Encrypted? = null
  var iops: Int? = null
 

enum class Delete_on_termination(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}
enum class Encrypted(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}
}
}

class License_specification(val license_configuration_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Instance_market_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var spot_options: List<Spot_options>? = null
  var market_type: Market_type? = null
 

enum class Market_type(val theValue: String ) {
	 spot ("spot") ;
	override fun toString() = theValue
	}

class Spot_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var block_duration_minutes: Int? = null
  var instance_interruption_behavior: String? = null
  var max_price: String? = null
  var spot_instance_type: String? = null
  var valid_until: String? = null
 

}
}

class Iam_instance_profile() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var arn: String? = null
  var name: String? = null
 

}

class Tag_specifications() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource_type: Resource_type? = null
  var tags: Map<String, String>? = null
 

enum class Resource_type(val theValue: String ) {
	 instance ("instance"), volume ("volume") ;
	override fun toString() = theValue
	}
}

class Credit_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cpu_credits: String? = null
 

}

class Placement() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var affinity: String? = null
  var availability_zone: String? = null
  var group_name: String? = null
  var host_id: String? = null
  var spread_domain: String? = null
  var tenancy: Tenancy? = null
 

enum class Tenancy(val theValue: String ) {
	 dedicated ("dedicated"), default ("default"), host ("host") ;
	override fun toString() = theValue
	}
}

class Cpu_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var core_count: Int? = null
  var threads_per_core: Int? = null
 

}

class Capacity_reservation_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var capacity_reservation_preference: Capacity_reservation_preference? = null
  var capacity_reservation_target: List<Capacity_reservation_target>? = null
 

enum class Capacity_reservation_preference(val theValue: String ) {
	 _open ("open"), none ("none") ;
	override fun toString() = theValue
	}

class Capacity_reservation_target() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var capacity_reservation_id: String? = null
 

}
}

class Elastic_gpu_specifications(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Elastic_inference_accelerator(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Monitoring() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}
}
