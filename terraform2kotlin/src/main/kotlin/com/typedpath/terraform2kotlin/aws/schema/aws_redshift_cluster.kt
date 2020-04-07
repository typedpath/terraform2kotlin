package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_redshift_cluster(val node_type : String, val cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var bucket_name: String? = null
  var tags: Map<String, String>? = null
  var cluster_subnet_group_name: String? = null
  var allow_version_upgrade: Boolean? = null
  var cluster_public_key: String? = null
  var snapshot_copy: List<Snapshot_copy>? = null
  var vpc_security_group_ids: List<String>? = null
  var automated_snapshot_retention_period: Int? = null
  var final_snapshot_identifier: String? = null
  var endpoint: String? = null
  var cluster_revision_number: String? = null
  var s3_key_prefix: String? = null
  var owner_account: String? = null
  var port: Int? = null
  var publicly_accessible: Boolean? = null
  var enhanced_vpc_routing: Boolean? = null
  var elastic_ip: String? = null
  var logging: List<Logging>? = null
  var snapshot_cluster_identifier: String? = null
  var master_username: String? = null
  var availability_zone: String? = null
  var preferred_maintenance_window: String? = null
  var database_name: String? = null
  var master_password: String? = null
  var cluster_parameter_group_name: String? = null
  var skip_final_snapshot: Boolean? = null
  var iam_roles: List<String>? = null
  var enable_logging: Boolean? = null
  var cluster_type: String? = null
  var number_of_nodes: Int? = null
  var encrypted: Boolean? = null
  var snapshot_identifier: String? = null
  var kms_key_id: String? = null
  var cluster_security_groups: List<String>? = null
  var cluster_version: String? = null
 


class Snapshot_copy(val destination_region : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var retention_period: Int? = null
  var grant_name: String? = null
 

}

class Logging(val enable : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var bucket_name: String? = null
  var s3_key_prefix: String? = null
 

}
fun cluster_security_groupsRef(subPath: String = "") = ref(this, "cluster_security_groups", subPath)
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
fun publicly_accessibleRef(subPath: String = "") = ref(this, "publicly_accessible", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun cluster_typeRef(subPath: String = "") = ref(this, "cluster_type", subPath)
fun cluster_versionRef(subPath: String = "") = ref(this, "cluster_version", subPath)
fun node_typeRef(subPath: String = "") = ref(this, "node_type", subPath)
fun allow_version_upgradeRef(subPath: String = "") = ref(this, "allow_version_upgrade", subPath)
fun cluster_revision_numberRef(subPath: String = "") = ref(this, "cluster_revision_number", subPath)
fun enable_loggingRef(subPath: String = "") = ref(this, "enable_logging", subPath)
fun number_of_nodesRef(subPath: String = "") = ref(this, "number_of_nodes", subPath)
fun iam_rolesRef(subPath: String = "") = ref(this, "iam_roles", subPath)
fun master_usernameRef(subPath: String = "") = ref(this, "master_username", subPath)
fun cluster_public_keyRef(subPath: String = "") = ref(this, "cluster_public_key", subPath)
fun cluster_subnet_group_nameRef(subPath: String = "") = ref(this, "cluster_subnet_group_name", subPath)
fun enhanced_vpc_routingRef(subPath: String = "") = ref(this, "enhanced_vpc_routing", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun cluster_parameter_group_nameRef(subPath: String = "") = ref(this, "cluster_parameter_group_name", subPath)
fun elastic_ipRef(subPath: String = "") = ref(this, "elastic_ip", subPath)
fun encryptedRef(subPath: String = "") = ref(this, "encrypted", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun cluster_identifierRef(subPath: String = "") = ref(this, "cluster_identifier", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun preferred_maintenance_windowRef(subPath: String = "") = ref(this, "preferred_maintenance_window", subPath)
fun s3_key_prefixRef(subPath: String = "") = ref(this, "s3_key_prefix", subPath)
fun automated_snapshot_retention_periodRef(subPath: String = "") = ref(this, "automated_snapshot_retention_period", subPath)
fun bucket_nameRef(subPath: String = "") = ref(this, "bucket_name", subPath)
fun database_nameRef(subPath: String = "") = ref(this, "database_name", subPath)
fun vpc_security_group_idsRef(subPath: String = "") = ref(this, "vpc_security_group_ids", subPath)
}
