package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_rds_cluster() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var engine_mode: Engine_mode? = null
  var vpc_security_group_ids: List<String>? = null
  var kms_key_id: String? = null
  var enable_http_endpoint: Boolean? = null
  var database_name: String? = null
  var master_username: String? = null
  var snapshot_identifier: String? = null
  var copy_tags_to_snapshot: Boolean? = null
  var cluster_identifier_prefix: String? = null
  var scaling_configuration: List<Scaling_configuration>? = null
  var skip_final_snapshot: Boolean? = null
  var availability_zones: List<String>? = null
  var preferred_maintenance_window: String? = null
  var replication_source_identifier: String? = null
  var enabled_cloudwatch_logs_exports: List<Enabled_cloudwatch_logs_exports>? = null
  var final_snapshot_identifier: String? = null
  var storage_encrypted: Boolean? = null
  var s3_import: List<S3_import>? = null
  var master_password: String? = null
  var backup_retention_period: Int? = null
  var iam_roles: List<String>? = null
  var iam_database_authentication_enabled: Boolean? = null
  var db_cluster_parameter_group_name: String? = null
  var db_subnet_group_name: String? = null
  var deletion_protection: Boolean? = null
  var port: Int? = null
  var apply_immediately: Boolean? = null
  var cluster_identifier: String? = null
  var cluster_members: List<String>? = null
  var global_cluster_identifier: String? = null
  var engine: Engine? = null
  var engine_version: String? = null
  var tags: Map<String, String>? = null
  var backtrack_window: Int? = null
  var source_region: String? = null
  var preferred_backup_window: String? = null
 

enum class Engine(val theValue: String ) {
	 aurora ("aurora"), aurora_mysql ("aurora-mysql"), aurora_postgresql ("aurora-postgresql") ;
	override fun toString() = theValue
	}
enum class Engine_mode(val theValue: String ) {
	 global ("global"), multimaster ("multimaster"), parallelquery ("parallelquery"), provisioned ("provisioned"), serverless ("serverless") ;
	override fun toString() = theValue
	}
enum class Enabled_cloudwatch_logs_exports(val theValue: String ) {
	 audit ("audit"), error ("error"), general ("general"), slowquery ("slowquery"), postgresql ("postgresql") ;
	override fun toString() = theValue
	}

class Scaling_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var max_capacity: Int? = null
  var min_capacity: Int? = null
  var seconds_until_auto_pause: Int? = null
  var timeout_action: Timeout_action? = null
  var auto_pause: Boolean? = null
 

enum class Timeout_action(val theValue: String ) {
	 ForceApplyCapacityChange ("ForceApplyCapacityChange"), RollbackCapacityChange ("RollbackCapacityChange") ;
	override fun toString() = theValue
	}
}

class S3_import(val bucket_name : String, val ingestion_role : String, val source_engine : String, val source_engine_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_prefix: String? = null
 

}
fun database_nameRef(subPath: String = "") = ref(this, "database_name", subPath)
fun preferred_maintenance_windowRef(subPath: String = "") = ref(this, "preferred_maintenance_window", subPath)
fun enabled_cloudwatch_logs_exportsRef(subPath: String = "") = ref(this, "enabled_cloudwatch_logs_exports", subPath)
fun iam_rolesRef(subPath: String = "") = ref(this, "iam_roles", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun hosted_zone_idRef(subPath: String = "") = ref(this, "hosted_zone_id", subPath)
fun storage_encryptedRef(subPath: String = "") = ref(this, "storage_encrypted", subPath)
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
fun preferred_backup_windowRef(subPath: String = "") = ref(this, "preferred_backup_window", subPath)
fun master_usernameRef(subPath: String = "") = ref(this, "master_username", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun reader_endpointRef(subPath: String = "") = ref(this, "reader_endpoint", subPath)
fun backup_retention_periodRef(subPath: String = "") = ref(this, "backup_retention_period", subPath)
fun cluster_membersRef(subPath: String = "") = ref(this, "cluster_members", subPath)
fun db_cluster_parameter_group_nameRef(subPath: String = "") = ref(this, "db_cluster_parameter_group_name", subPath)
fun vpc_security_group_idsRef(subPath: String = "") = ref(this, "vpc_security_group_ids", subPath)
fun availability_zonesRef(subPath: String = "") = ref(this, "availability_zones", subPath)
fun engineRef(subPath: String = "") = ref(this, "engine", subPath)
fun iam_database_authentication_enabledRef(subPath: String = "") = ref(this, "iam_database_authentication_enabled", subPath)
fun replication_source_identifierRef(subPath: String = "") = ref(this, "replication_source_identifier", subPath)
fun cluster_identifierRef(subPath: String = "") = ref(this, "cluster_identifier", subPath)
fun cluster_resource_idRef(subPath: String = "") = ref(this, "cluster_resource_id", subPath)
fun final_snapshot_identifierRef(subPath: String = "") = ref(this, "final_snapshot_identifier", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun db_subnet_group_nameRef(subPath: String = "") = ref(this, "db_subnet_group_name", subPath)
fun engine_versionRef(subPath: String = "") = ref(this, "engine_version", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
