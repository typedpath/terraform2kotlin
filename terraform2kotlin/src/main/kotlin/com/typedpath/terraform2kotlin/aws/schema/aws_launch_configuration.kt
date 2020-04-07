package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_launch_configuration(val image_id : String, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var security_groups: List<String>? = null
  var vpc_classic_link_security_groups: List<String>? = null
  var ebs_optimized: Boolean? = null
  var placement_tenancy: String? = null
  var root_block_device: List<Root_block_device>? = null
  var name: String? = null
  var user_data_base64: String? = null
  var enable_monitoring: Boolean? = null
  var key_name: String? = null
  var name_prefix: String? = null
  var vpc_classic_link_id: String? = null
  var associate_public_ip_address: Boolean? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var iam_instance_profile: String? = null
  var user_data: String? = null
  var spot_price: String? = null
 


class Root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var no_device: Boolean? = null
  var iops: Int? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var encrypted: Boolean? = null
  var delete_on_termination: Boolean? = null
 

}

class Ephemeral_block_device(val device_name : String, val virtual_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun enable_monitoringRef(subPath: String = "") = ref(this, "enable_monitoring", subPath)
fun ebs_block_deviceRef(subPath: String = "") = ref(this, "ebs_block_device", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun image_idRef(subPath: String = "") = ref(this, "image_id", subPath)
fun instance_typeRef(subPath: String = "") = ref(this, "instance_type", subPath)
fun user_dataRef(subPath: String = "") = ref(this, "user_data", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun ephemeral_block_deviceRef(subPath: String = "") = ref(this, "ephemeral_block_device", subPath)
fun ebs_optimizedRef(subPath: String = "") = ref(this, "ebs_optimized", subPath)
fun placement_tenancyRef(subPath: String = "") = ref(this, "placement_tenancy", subPath)
fun iam_instance_profileRef(subPath: String = "") = ref(this, "iam_instance_profile", subPath)
fun vpc_classic_link_idRef(subPath: String = "") = ref(this, "vpc_classic_link_id", subPath)
fun vpc_classic_link_security_groupsRef(subPath: String = "") = ref(this, "vpc_classic_link_security_groups", subPath)
fun associate_public_ip_addressRef(subPath: String = "") = ref(this, "associate_public_ip_address", subPath)
fun key_nameRef(subPath: String = "") = ref(this, "key_name", subPath)
fun spot_priceRef(subPath: String = "") = ref(this, "spot_price", subPath)
fun root_block_deviceRef(subPath: String = "") = ref(this, "root_block_device", subPath)
}
