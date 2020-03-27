package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dms_replication_subnet_group(val replication_subnet_group_id : String, val subnet_ids : List<String>, val replication_subnet_group_description : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
