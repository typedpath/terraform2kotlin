package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_instance(val instance_class : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var monitoring_interval: Int? = null
  var option_group_name: String? = null
  var identifier_prefix: String? = null
  var backup_window: String? = null
  var s3_import: List<S3_import>? = null
  var db_subnet_group_name: String? = null
  var username: String? = null
  var monitoring_role_arn: String? = null
  var identifier: String? = null
  var kms_key_id: String? = null
  var delete_automated_backups: Boolean? = null
  var final_snapshot_identifier: String? = null
  var replicate_source_db: String? = null
  var performance_insights_retention_period: Int? = null
  var password: String? = null
  var availability_zone: String? = null
  var license_model: String? = null
  var character_set_name: String? = null
  var port: Int? = null
  var parameter_group_name: String? = null
  var enabled_cloudwatch_logs_exports: List<Enabled_cloudwatch_logs_exports>? = null
  var storage_encrypted: Boolean? = null
  var domain_iam_role_name: String? = null
  var engine: String? = null
  var engine_version: String? = null
  var backup_retention_period: Int? = null
  var ca_cert_identifier: String? = null
  var maintenance_window: String? = null
  var performance_insights_kms_key_id: String? = null
  var tags: Map<String, String>? = null
  var allocated_storage: Int? = null
  var max_allocated_storage: Int? = null
  var apply_immediately: Boolean? = null
  var allow_major_version_upgrade: Boolean? = null
  var skip_final_snapshot: Boolean? = null
  var domain: String? = null
  var performance_insights_enabled: Boolean? = null
  var iops: Int? = null
  var security_group_names: List<String>? = null
  var snapshot_identifier: String? = null
  var auto_minor_version_upgrade: Boolean? = null
  var iam_database_authentication_enabled: Boolean? = null
  var copy_tags_to_snapshot: Boolean? = null
  var timezone: String? = null
  var name: String? = null
  var deletion_protection: Boolean? = null
  var multi_az: Boolean? = null
  var publicly_accessible: Boolean? = null
  var vpc_security_group_ids: List<String>? = null
  var storage_type: String? = null
 

enum class Enabled_cloudwatch_logs_exports(val theValue: String ) {
	 agent ("agent"), alert ("alert"), audit ("audit"), error ("error"), general ("general"), listener ("listener"), slowquery ("slowquery"), trace ("trace"), postgresql ("postgresql"), upgrade ("upgrade") ;
	override fun toString() = theValue
	}

class S3_import(val bucket_name : String, val ingestion_role : String, val source_engine : String, val source_engine_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_prefix: String? = null
 

}
fun engineRef(subPath: String = "") = ref(this, "engine", subPath)
fun multi_azRef(subPath: String = "") = ref(this, "multi_az", subPath)
fun ca_cert_identifierRef(subPath: String = "") = ref(this, "ca_cert_identifier", subPath)
fun allocated_storageRef(subPath: String = "") = ref(this, "allocated_storage", subPath)
fun db_security_groupsRef(subPath: String = "") = ref(this, "db_security_groups", subPath)
fun db_nameRef(subPath: String = "") = ref(this, "db_name", subPath)
fun license_modelRef(subPath: String = "") = ref(this, "license_model", subPath)
fun monitoring_role_arnRef(subPath: String = "") = ref(this, "monitoring_role_arn", subPath)
fun preferred_backup_windowRef(subPath: String = "") = ref(this, "preferred_backup_window", subPath)
fun timezoneRef(subPath: String = "") = ref(this, "timezone", subPath)
fun vpc_security_groupsRef(subPath: String = "") = ref(this, "vpc_security_groups", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun hosted_zone_idRef(subPath: String = "") = ref(this, "hosted_zone_id", subPath)
fun option_group_membershipsRef(subPath: String = "") = ref(this, "option_group_memberships", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun storage_typeRef(subPath: String = "") = ref(this, "storage_type", subPath)
fun db_parameter_groupsRef(subPath: String = "") = ref(this, "db_parameter_groups", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun master_usernameRef(subPath: String = "") = ref(this, "master_username", subPath)
fun monitoring_intervalRef(subPath: String = "") = ref(this, "monitoring_interval", subPath)
fun db_cluster_identifierRef(subPath: String = "") = ref(this, "db_cluster_identifier", subPath)
fun db_subnet_groupRef(subPath: String = "") = ref(this, "db_subnet_group", subPath)
fun preferred_maintenance_windowRef(subPath: String = "") = ref(this, "preferred_maintenance_window", subPath)
fun resource_idRef(subPath: String = "") = ref(this, "resource_id", subPath)
fun addressRef(subPath: String = "") = ref(this, "address", subPath)
fun backup_retention_periodRef(subPath: String = "") = ref(this, "backup_retention_period", subPath)
fun db_instance_classRef(subPath: String = "") = ref(this, "db_instance_class", subPath)
fun db_instance_portRef(subPath: String = "") = ref(this, "db_instance_port", subPath)
fun enabled_cloudwatch_logs_exportsRef(subPath: String = "") = ref(this, "enabled_cloudwatch_logs_exports", subPath)
fun engine_versionRef(subPath: String = "") = ref(this, "engine_version", subPath)
fun storage_encryptedRef(subPath: String = "") = ref(this, "storage_encrypted", subPath)
fun db_instance_identifierRef(subPath: String = "") = ref(this, "db_instance_identifier", subPath)
fun auto_minor_version_upgradeRef(subPath: String = "") = ref(this, "auto_minor_version_upgrade", subPath)
fun iopsRef(subPath: String = "") = ref(this, "iops", subPath)
fun publicly_accessibleRef(subPath: String = "") = ref(this, "publicly_accessible", subPath)
fun replicate_source_dbRef(subPath: String = "") = ref(this, "replicate_source_db", subPath)
fun db_instance_arnRef(subPath: String = "") = ref(this, "db_instance_arn", subPath)
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
