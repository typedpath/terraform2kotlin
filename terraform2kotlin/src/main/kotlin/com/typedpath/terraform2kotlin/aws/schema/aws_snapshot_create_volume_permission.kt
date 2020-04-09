package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_snapshot_create_volume_permission(val account_id : String, val snapshot_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
