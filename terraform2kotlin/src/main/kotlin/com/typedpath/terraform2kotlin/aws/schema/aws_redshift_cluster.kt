package com.typedpath.terraform2kotlin.aws.schema

class aws_redshift_cluster(val node_type : String, val cluster_identifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cluster_type: String? = null
  var vpc_security_group_ids: List<String>? = null
  var number_of_nodes: Int? = null
  var encrypted: Boolean? = null
  var endpoint: String? = null
  var master_password: String? = null
  var allow_version_upgrade: Boolean? = null
  var enhanced_vpc_routing: Boolean? = null
  var cluster_parameter_group_name: String? = null
  var kms_key_id: String? = null
  var enable_logging: Boolean? = null
  var snapshot_cluster_identifier: String? = null
  var master_username: String? = null
  var cluster_security_groups: List<String>? = null
  var preferred_maintenance_window: String? = null
  var skip_final_snapshot: Boolean? = null
  var snapshot_identifier: String? = null
  var owner_account: String? = null
  var tags: Map<String, String>? = null
  var availability_zone: String? = null
  var cluster_revision_number: String? = null
  var iam_roles: List<String>? = null
  var snapshot_copy: List<Snapshot_copy>? = null
  var logging: List<Logging>? = null
  var bucket_name: String? = null
  var automated_snapshot_retention_period: Int? = null
  var port: Int? = null
  var cluster_version: String? = null
  var cluster_public_key: String? = null
  var database_name: String? = null
  var final_snapshot_identifier: String? = null
  var s3_key_prefix: String? = null
  var cluster_subnet_group_name: String? = null
  var publicly_accessible: Boolean? = null
  var elastic_ip: String? = null
 


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
}
