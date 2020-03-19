package com.typedpath.terraform2kotlin.aws.schema

class aws_storagegateway_cached_iscsi_volume(val gateway_arn : String, val target_name : String, val volume_size_in_bytes : Int, val network_interface_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var snapshot_id: String? = null
  var source_volume_arn: String? = null
  var tags: Map<String, String>? = null
 

}
