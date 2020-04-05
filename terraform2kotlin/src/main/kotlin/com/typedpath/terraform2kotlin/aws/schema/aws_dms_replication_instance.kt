package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dms_replication_instance(val replication_instance_id : String, val replication_instance_class : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var replication_subnet_group_id: String? = null
  var tags: Map<String, String>? = null
  var vpc_security_group_ids: List<String>? = null
  var auto_minor_version_upgrade: Boolean? = null
  var kms_key_arn: String? = null
  var availability_zone: String? = null
  var multi_az: Boolean? = null
  var publicly_accessible: Boolean? = null
  var allocated_storage: Int? = null
  var apply_immediately: Boolean? = null
  var engine_version: String? = null
  var preferred_maintenance_window: String? = null
 

}
