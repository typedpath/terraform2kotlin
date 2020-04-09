package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_storagegateway_cached_iscsi_volume(val target_name : String, val volume_size_in_bytes : Int, val gateway_arn : String, val network_interface_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var snapshot_id: String? = null
  var source_volume_arn: String? = null
  var tags: Map<String, String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
