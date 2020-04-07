package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ami_from_instance(val source_instance_id : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var snapshot_without_reboot: Boolean? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var tags: Map<String, String>? = null
 


class Ephemeral_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ebs_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
