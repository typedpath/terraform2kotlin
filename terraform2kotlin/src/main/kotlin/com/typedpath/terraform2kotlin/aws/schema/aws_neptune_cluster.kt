package com.typedpath.terraform2kotlin.aws.schema

class aws_neptune_cluster() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var final_snapshot_identifier: String? = null
  var neptune_subnet_group_name: String? = null
  var replication_source_identifier: String? = null
  var storage_encrypted: Boolean? = null
  var skip_final_snapshot: Boolean? = null
  var neptune_cluster_parameter_group_name: String? = null
  var snapshot_identifier: String? = null
  var engine_version: String? = null
  var kms_key_arn: String? = null
  var apply_immediately: Boolean? = null
  var availability_zones: List<String>? = null
  var cluster_identifier: String? = null
  var preferred_maintenance_window: String? = null
  var preferred_backup_window: String? = null
  var tags: Map<String, String>? = null
  var vpc_security_group_ids: List<String>? = null
  var enable_cloudwatch_logs_exports: List<Enable_cloudwatch_logs_exports>? = null
  var engine: Engine? = null
  var port: Int? = null
  var deletion_protection: Boolean? = null
  var backup_retention_period: Int? = null
  var cluster_identifier_prefix: String? = null
  var iam_roles: List<String>? = null
  var iam_database_authentication_enabled: Boolean? = null
 

enum class Enable_cloudwatch_logs_exports(val theValue: String ) {
	 audit ("audit") ;
	override fun toString() = theValue
	}
enum class Engine(val theValue: String ) {
	 neptune ("neptune") ;
	override fun toString() = theValue
	}
}
