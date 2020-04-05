package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_launch_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cpu_options: List<Cpu_options>? = null
  var instance_initiated_shutdown_behavior: Instance_initiated_shutdown_behavior? = null
  var name: String? = null
  var ebs_optimized: Ebs_optimized? = null
  var ram_disk_id: String? = null
  var security_group_names: List<String>? = null
  var user_data: String? = null
  var tags: Map<String, String>? = null
  var credit_specification: List<Credit_specification>? = null
  var disable_api_termination: Boolean? = null
  var tag_specifications: List<Tag_specifications>? = null
  var description: String? = null
  var block_device_mappings: List<Block_device_mappings>? = null
  var elastic_gpu_specifications: List<Elastic_gpu_specifications>? = null
  var placement: List<Placement>? = null
  var network_interfaces: List<Network_interfaces>? = null
  var name_prefix: String? = null
  var elastic_inference_accelerator: List<Elastic_inference_accelerator>? = null
  var iam_instance_profile: List<Iam_instance_profile>? = null
  var image_id: String? = null
  var key_name: String? = null
  var license_specification: List<License_specification>? = null
  var kernel_id: String? = null
  var capacity_reservation_specification: List<Capacity_reservation_specification>? = null
  var instance_market_options: List<Instance_market_options>? = null
  var instance_type: String? = null
  var monitoring: List<Monitoring>? = null
  var vpc_security_group_ids: List<String>? = null
 

enum class Instance_initiated_shutdown_behavior(val theValue: String ) {
	 stop ("stop"), terminate ("terminate") ;
	override fun toString() = theValue
	}
enum class Ebs_optimized(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}

class Tag_specifications() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tags: Map<String, String>? = null
  var resource_type: Resource_type? = null
 

enum class Resource_type(val theValue: String ) {
	 instance ("instance"), volume ("volume") ;
	override fun toString() = theValue
	}
}

class Elastic_gpu_specifications(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Placement() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var availability_zone: String? = null
  var group_name: String? = null
  var host_id: String? = null
  var spread_domain: String? = null
  var tenancy: Tenancy? = null
  var affinity: String? = null
 

enum class Tenancy(val theValue: String ) {
	 dedicated ("dedicated"), default ("default"), host ("host") ;
	override fun toString() = theValue
	}
}

class Network_interfaces() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var associate_public_ip_address: Associate_public_ip_address? = null
  var delete_on_termination: Boolean? = null
  var description: String? = null
  var security_groups: List<String>? = null
  var ipv6_address_count: Int? = null
  var ipv6_addresses: List<String>? = null
  var network_interface_id: String? = null
  var private_ip_address: String? = null
  var ipv4_addresses: List<String>? = null
  var subnet_id: String? = null
  var device_index: Int? = null
  var ipv4_address_count: Int? = null
 

enum class Associate_public_ip_address(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}
}

class Iam_instance_profile() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var arn: String? = null
  var name: String? = null
 

}

class License_specification(val license_configuration_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

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

class Credit_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cpu_credits: String? = null
 

}

class Monitoring() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}

class Block_device_mappings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ebs: List<Ebs>? = null
  var device_name: String? = null
  var no_device: String? = null
  var virtual_name: String? = null
 


class Ebs() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encrypted: Encrypted? = null
  var iops: Int? = null
  var kms_key_id: String? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Delete_on_termination? = null
 

enum class Encrypted(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}
enum class Delete_on_termination(val theValue: String ) {
	 _empty ("\"\""), _false ("false"), _true ("true") ;
	override fun toString() = theValue
	}
}
}

class Elastic_inference_accelerator(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
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

class Cpu_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var core_count: Int? = null
  var threads_per_core: Int? = null
 

}
fun ebs_optimizedRef(subPath: String = "") = ref(this, "ebs_optimized", subPath)
fun image_idRef(subPath: String = "") = ref(this, "image_id", subPath)
fun network_interfacesRef(subPath: String = "") = ref(this, "network_interfaces", subPath)
fun vpc_security_group_idsRef(subPath: String = "") = ref(this, "vpc_security_group_ids", subPath)
fun default_versionRef(subPath: String = "") = ref(this, "default_version", subPath)
fun block_device_mappingsRef(subPath: String = "") = ref(this, "block_device_mappings", subPath)
fun disable_api_terminationRef(subPath: String = "") = ref(this, "disable_api_termination", subPath)
fun elastic_gpu_specificationsRef(subPath: String = "") = ref(this, "elastic_gpu_specifications", subPath)
fun key_nameRef(subPath: String = "") = ref(this, "key_name", subPath)
fun tag_specificationsRef(subPath: String = "") = ref(this, "tag_specifications", subPath)
fun user_dataRef(subPath: String = "") = ref(this, "user_data", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun latest_versionRef(subPath: String = "") = ref(this, "latest_version", subPath)
fun placementRef(subPath: String = "") = ref(this, "placement", subPath)
fun ram_disk_idRef(subPath: String = "") = ref(this, "ram_disk_id", subPath)
fun security_group_namesRef(subPath: String = "") = ref(this, "security_group_names", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun iam_instance_profileRef(subPath: String = "") = ref(this, "iam_instance_profile", subPath)
fun instance_initiated_shutdown_behaviorRef(subPath: String = "") = ref(this, "instance_initiated_shutdown_behavior", subPath)
fun instance_market_optionsRef(subPath: String = "") = ref(this, "instance_market_options", subPath)
fun instance_typeRef(subPath: String = "") = ref(this, "instance_type", subPath)
fun kernel_idRef(subPath: String = "") = ref(this, "kernel_id", subPath)
fun monitoringRef(subPath: String = "") = ref(this, "monitoring", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun credit_specificationRef(subPath: String = "") = ref(this, "credit_specification", subPath)
}
