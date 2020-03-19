package com.typedpath.terraform2kotlin.aws.schema

class aws_db_snapshot(val db_instance_identifier : String, val db_snapshot_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
