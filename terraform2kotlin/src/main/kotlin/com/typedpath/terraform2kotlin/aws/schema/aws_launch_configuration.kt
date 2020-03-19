package com.typedpath.terraform2kotlin.aws.schema

class aws_launch_configuration(val image_id : String, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name: String? = null
  var ebs_optimized: Boolean? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var iam_instance_profile: String? = null
  var user_data: String? = null
  var root_block_device: List<Root_block_device>? = null
  var vpc_classic_link_id: String? = null
  var vpc_classic_link_security_groups: List<String>? = null
  var placement_tenancy: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var name_prefix: String? = null
  var key_name: String? = null
  var user_data_base64: String? = null
  var security_groups: List<String>? = null
  var associate_public_ip_address: Boolean? = null
  var spot_price: String? = null
  var enable_monitoring: Boolean? = null
 


class Ephemeral_block_device(val device_name : String, val virtual_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var volume_size: Int? = null
  var volume_type: String? = null
  var encrypted: Boolean? = null
  var delete_on_termination: Boolean? = null
  var no_device: Boolean? = null
  var iops: Int? = null
  var snapshot_id: String? = null
 

}
}
