package com.typedpath.terraform2kotlin.aws.schema

class aws_redshift_snapshot_schedule_association(val cluster_identifier : String, val schedule_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
