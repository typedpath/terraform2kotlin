package com.typedpath.terraform2kotlin.aws.schema

class aws_snapshot_create_volume_permission(val snapshot_id : String, val account_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}