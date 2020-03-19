package com.typedpath.terraform2kotlin.aws.schema

class aws_db_instance(val instance_class : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var storage_encrypted: Boolean? = null
  var iops: Int? = null
  var multi_az: Boolean? = null
  var backup_retention_period: Int? = null
  var performance_insights_enabled: Boolean? = null
  var name: String? = null
  var maintenance_window: String? = null
  var copy_tags_to_snapshot: Boolean? = null
  var kms_key_id: String? = null
  var engine: String? = null
  var vpc_security_group_ids: List<String>? = null
  var monitoring_role_arn: String? = null
  var domain_iam_role_name: String? = null
  var skip_final_snapshot: Boolean? = null
  var db_subnet_group_name: String? = null
  var option_group_name: String? = null
  var publicly_accessible: Boolean? = null
  var parameter_group_name: String? = null
  var domain: String? = null
  var tags: Map<String, String>? = null
  var password: String? = null
  var identifier: String? = null
  var s3_import: List<S3_import>? = null
  var performance_insights_kms_key_id: String? = null
  var backup_window: String? = null
  var replicate_source_db: String? = null
  var allocated_storage: Int? = null
  var final_snapshot_identifier: String? = null
  var performance_insights_retention_period: Int? = null
  var delete_automated_backups: Boolean? = null
  var allow_major_version_upgrade: Boolean? = null
  var auto_minor_version_upgrade: Boolean? = null
  var enabled_cloudwatch_logs_exports: List<Enabled_cloudwatch_logs_exports>? = null
  var max_allocated_storage: Int? = null
  var port: Int? = null
  var snapshot_identifier: String? = null
  var engine_version: String? = null
  var ca_cert_identifier: String? = null
  var identifier_prefix: String? = null
  var license_model: String? = null
  var availability_zone: String? = null
  var security_group_names: List<String>? = null
  var timezone: String? = null
  var iam_database_authentication_enabled: Boolean? = null
  var username: String? = null
  var character_set_name: String? = null
  var storage_type: String? = null
  var deletion_protection: Boolean? = null
  var apply_immediately: Boolean? = null
  var monitoring_interval: Int? = null
 

enum class Enabled_cloudwatch_logs_exports(val theValue: String ) {
	 agent ("agent"), alert ("alert"), audit ("audit"), error ("error"), general ("general"), listener ("listener"), slowquery ("slowquery"), trace ("trace"), postgresql ("postgresql"), upgrade ("upgrade") ;
	override fun toString() = theValue
	}

class S3_import(val bucket_name : String, val ingestion_role : String, val source_engine : String, val source_engine_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_prefix: String? = null
 

}
}
