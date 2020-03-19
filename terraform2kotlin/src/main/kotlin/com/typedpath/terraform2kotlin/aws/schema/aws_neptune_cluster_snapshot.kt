package com.typedpath.terraform2kotlin.aws.schema

class aws_neptune_cluster_snapshot(val db_cluster_snapshot_identifier : String, val db_cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
