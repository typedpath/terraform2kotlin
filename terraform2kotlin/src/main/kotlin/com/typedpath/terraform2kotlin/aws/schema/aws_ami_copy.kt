package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ami_copy(val source_ami_id : String, val source_ami_region : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var kms_key_id: String? = null
  var encrypted: Boolean? = null
 


class Ephemeral_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ebs_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
