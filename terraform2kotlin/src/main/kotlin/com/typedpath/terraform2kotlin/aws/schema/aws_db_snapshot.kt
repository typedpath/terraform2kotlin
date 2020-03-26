package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_snapshot(val db_snapshot_identifier : String, val db_instance_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

fun source_regionRef(subPath: String = "") = ref(this, "source_region", subPath)
fun db_snapshot_identifierRef(subPath: String = "") = ref(this, "db_snapshot_identifier", subPath)
fun include_publicRef(subPath: String = "") = ref(this, "include_public", subPath)
fun encryptedRef(subPath: String = "") = ref(this, "encrypted", subPath)
fun option_group_nameRef(subPath: String = "") = ref(this, "option_group_name", subPath)
fun storage_typeRef(subPath: String = "") = ref(this, "storage_type", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun snapshot_typeRef(subPath: String = "") = ref(this, "snapshot_type", subPath)
fun allocated_storageRef(subPath: String = "") = ref(this, "allocated_storage", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun kms_key_idRef(subPath: String = "") = ref(this, "kms_key_id", subPath)
fun snapshot_create_timeRef(subPath: String = "") = ref(this, "snapshot_create_time", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun include_sharedRef(subPath: String = "") = ref(this, "include_shared", subPath)
fun db_snapshot_arnRef(subPath: String = "") = ref(this, "db_snapshot_arn", subPath)
fun engineRef(subPath: String = "") = ref(this, "engine", subPath)
fun source_db_snapshot_identifierRef(subPath: String = "") = ref(this, "source_db_snapshot_identifier", subPath)
fun license_modelRef(subPath: String = "") = ref(this, "license_model", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun db_instance_identifierRef(subPath: String = "") = ref(this, "db_instance_identifier", subPath)
fun most_recentRef(subPath: String = "") = ref(this, "most_recent", subPath)
fun engine_versionRef(subPath: String = "") = ref(this, "engine_version", subPath)
fun iopsRef(subPath: String = "") = ref(this, "iops", subPath)
}
