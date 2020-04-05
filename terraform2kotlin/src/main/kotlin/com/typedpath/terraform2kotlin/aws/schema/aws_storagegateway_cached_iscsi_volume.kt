package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_storagegateway_cached_iscsi_volume(val volume_size_in_bytes : Int, val gateway_arn : String, val network_interface_id : String, val target_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var source_volume_arn: String? = null
  var tags: Map<String, String>? = null
  var snapshot_id: String? = null
 

}
