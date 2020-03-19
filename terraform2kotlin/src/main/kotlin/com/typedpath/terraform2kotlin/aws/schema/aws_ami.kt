package com.typedpath.terraform2kotlin.aws.schema

class aws_ami(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var image_location: String? = null
  var root_device_name: String? = null
  var description: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var ena_support: Boolean? = null
  var ramdisk_id: String? = null
  var tags: Map<String, String>? = null
  var virtualization_type: String? = null
  var sriov_net_support: String? = null
  var architecture: String? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var kernel_id: String? = null
 


class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encrypted: Boolean? = null
  var iops: Int? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
 

}

class Ephemeral_block_device(val device_name : String, val virtual_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
