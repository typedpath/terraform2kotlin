package com.typedpath.terraform2kotlin.aws.schema

class aws_rds_cluster() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cluster_members: List<String>? = null
  var database_name: String? = null
  var global_cluster_identifier: String? = null
  var enable_http_endpoint: Boolean? = null
  var availability_zones: List<String>? = null
  var db_subnet_group_name: String? = null
  var deletion_protection: Boolean? = null
  var preferred_backup_window: String? = null
  var source_region: String? = null
  var backtrack_window: Int? = null
  var cluster_identifier: String? = null
  var kms_key_id: String? = null
  var cluster_identifier_prefix: String? = null
  var s3_import: List<S3_import>? = null
  var master_password: String? = null
  var replication_source_identifier: String? = null
  var iam_database_authentication_enabled: Boolean? = null
  var tags: Map<String, String>? = null
  var copy_tags_to_snapshot: Boolean? = null
  var engine_mode: Engine_mode? = null
  var engine_version: String? = null
  var final_snapshot_identifier: String? = null
  var master_username: String? = null
  var snapshot_identifier: String? = null
  var backup_retention_period: Int? = null
  var engine: Engine? = null
  var storage_encrypted: Boolean? = null
  var vpc_security_group_ids: List<String>? = null
  var scaling_configuration: List<Scaling_configuration>? = null
  var port: Int? = null
  var db_cluster_parameter_group_name: String? = null
  var skip_final_snapshot: Boolean? = null
  var apply_immediately: Boolean? = null
  var preferred_maintenance_window: String? = null
  var iam_roles: List<String>? = null
  var enabled_cloudwatch_logs_exports: List<Enabled_cloudwatch_logs_exports>? = null
 

enum class Enabled_cloudwatch_logs_exports(val theValue: String ) {
	 audit ("audit"), error ("error"), general ("general"), slowquery ("slowquery"), postgresql ("postgresql") ;
	override fun toString() = theValue
	}
enum class Engine_mode(val theValue: String ) {
	 global ("global"), multimaster ("multimaster"), parallelquery ("parallelquery"), provisioned ("provisioned"), serverless ("serverless") ;
	override fun toString() = theValue
	}
enum class Engine(val theValue: String ) {
	 aurora ("aurora"), aurora_mysql ("aurora-mysql"), aurora_postgresql ("aurora-postgresql") ;
	override fun toString() = theValue
	}

class S3_import(val ingestion_role : String, val source_engine : String, val source_engine_version : String, val bucket_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_prefix: String? = null
 

}

class Scaling_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var min_capacity: Int? = null
  var seconds_until_auto_pause: Int? = null
  var timeout_action: Timeout_action? = null
  var auto_pause: Boolean? = null
  var max_capacity: Int? = null
 

enum class Timeout_action(val theValue: String ) {
	 ForceApplyCapacityChange ("ForceApplyCapacityChange"), RollbackCapacityChange ("RollbackCapacityChange") ;
	override fun toString() = theValue
	}
}
}
