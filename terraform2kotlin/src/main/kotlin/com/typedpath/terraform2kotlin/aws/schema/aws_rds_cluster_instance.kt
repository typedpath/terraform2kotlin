package com.typedpath.terraform2kotlin.aws.schema

class aws_rds_cluster_instance(val instance_class : String, val cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var db_parameter_group_name: String? = null
  var promotion_tier: Int? = null
  var performance_insights_kms_key_id: String? = null
  var auto_minor_version_upgrade: Boolean? = null
  var copy_tags_to_snapshot: Boolean? = null
  var db_subnet_group_name: String? = null
  var engine_version: String? = null
  var preferred_backup_window: String? = null
  var ca_cert_identifier: String? = null
  var tags: Map<String, String>? = null
  var monitoring_interval: Int? = null
  var performance_insights_enabled: Boolean? = null
  var identifier: String? = null
  var engine: Engine? = null
  var apply_immediately: Boolean? = null
  var monitoring_role_arn: String? = null
  var identifier_prefix: String? = null
  var publicly_accessible: Boolean? = null
  var preferred_maintenance_window: String? = null
 

enum class Engine(val theValue: String ) {
	 aurora ("aurora"), aurora_mysql ("aurora-mysql"), aurora_postgresql ("aurora-postgresql") ;
	override fun toString() = theValue
	}
}
