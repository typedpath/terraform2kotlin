package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_docdb_cluster() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_security_group_ids: List<String>? = null
  var tags: Map<String, String>? = null
  var master_username: String? = null
  var db_subnet_group_name: String? = null
  var preferred_backup_window: String? = null
  var cluster_identifier: String? = null
  var cluster_identifier_prefix: String? = null
  var kms_key_id: String? = null
  var storage_encrypted: Boolean? = null
  var final_snapshot_identifier: String? = null
  var backup_retention_period: Int? = null
  var port: Int? = null
  var skip_final_snapshot: Boolean? = null
  var master_password: String? = null
  var snapshot_identifier: String? = null
  var availability_zones: List<String>? = null
  var engine: Engine? = null
  var cluster_members: List<String>? = null
  var preferred_maintenance_window: String? = null
  var enabled_cloudwatch_logs_exports: List<Enabled_cloudwatch_logs_exports>? = null
  var db_cluster_parameter_group_name: String? = null
  var engine_version: String? = null
  var apply_immediately: Boolean? = null
 

enum class Engine(val theValue: String ) {
	 docdb ("docdb") ;
	override fun toString() = theValue
	}
enum class Enabled_cloudwatch_logs_exports(val theValue: String ) {
	 audit ("audit"), profiler ("profiler") ;
	override fun toString() = theValue
	}
}
