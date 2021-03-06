package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dms_replication_instance(val replication_instance_class : String, val replication_instance_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_security_group_ids: List<String>? = null
  var auto_minor_version_upgrade: Boolean? = null
  var engine_version: String? = null
  var kms_key_arn: String? = null
  var multi_az: Boolean? = null
  var availability_zone: String? = null
  var allocated_storage: Int? = null
  var replication_subnet_group_id: String? = null
  var tags: Map<String, String>? = null
  var apply_immediately: Boolean? = null
  var preferred_maintenance_window: String? = null
  var publicly_accessible: Boolean? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
