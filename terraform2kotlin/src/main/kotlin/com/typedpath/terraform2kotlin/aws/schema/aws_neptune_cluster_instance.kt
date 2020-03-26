package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_neptune_cluster_instance(val instance_class : String, val cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var auto_minor_version_upgrade: Boolean? = null
  var identifier: String? = null
  var preferred_backup_window: String? = null
  var promotion_tier: Int? = null
  var engine_version: String? = null
  var identifier_prefix: String? = null
  var neptune_parameter_group_name: String? = null
  var publicly_accessible: Boolean? = null
  var tags: Map<String, String>? = null
  var availability_zone: String? = null
  var neptune_subnet_group_name: String? = null
  var port: Int? = null
  var apply_immediately: Boolean? = null
  var engine: Engine? = null
  var preferred_maintenance_window: String? = null
 

enum class Engine(val theValue: String ) {
	 neptune ("neptune") ;
	override fun toString() = theValue
	}
}
