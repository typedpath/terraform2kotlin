package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_cluster_snapshot(val db_cluster_identifier : String, val db_cluster_snapshot_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

fun availability_zonesRef(subPath: String = "") = ref(this, "availability_zones", subPath)
fun db_cluster_snapshot_arnRef(subPath: String = "") = ref(this, "db_cluster_snapshot_arn", subPath)
fun engineRef(subPath: String = "") = ref(this, "engine", subPath)
fun license_modelRef(subPath: String = "") = ref(this, "license_model", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun allocated_storageRef(subPath: String = "") = ref(this, "allocated_storage", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun include_publicRef(subPath: String = "") = ref(this, "include_public", subPath)
fun db_cluster_snapshot_identifierRef(subPath: String = "") = ref(this, "db_cluster_snapshot_identifier", subPath)
fun most_recentRef(subPath: String = "") = ref(this, "most_recent", subPath)
fun storage_encryptedRef(subPath: String = "") = ref(this, "storage_encrypted", subPath)
fun engine_versionRef(subPath: String = "") = ref(this, "engine_version", subPath)
fun source_db_cluster_snapshot_arnRef(subPath: String = "") = ref(this, "source_db_cluster_snapshot_arn", subPath)
fun snapshot_create_timeRef(subPath: String = "") = ref(this, "snapshot_create_time", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun db_cluster_identifierRef(subPath: String = "") = ref(this, "db_cluster_identifier", subPath)
fun include_sharedRef(subPath: String = "") = ref(this, "include_shared", subPath)
fun snapshot_typeRef(subPath: String = "") = ref(this, "snapshot_type", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
