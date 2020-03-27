package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_neptune_cluster_instance(val cluster_identifier : String, val instance_class : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var identifier: String? = null
  var neptune_parameter_group_name: String? = null
  var port: Int? = null
  var promotion_tier: Int? = null
  var availability_zone: String? = null
  var engine_version: String? = null
  var identifier_prefix: String? = null
  var neptune_subnet_group_name: String? = null
  var tags: Map<String, String>? = null
  var engine: Engine? = null
  var preferred_backup_window: String? = null
  var preferred_maintenance_window: String? = null
  var publicly_accessible: Boolean? = null
  var apply_immediately: Boolean? = null
  var auto_minor_version_upgrade: Boolean? = null
 

enum class Engine(val theValue: String ) {
	 neptune ("neptune") ;
	override fun toString() = theValue
	}
}
