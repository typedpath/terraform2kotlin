package com.typedpath.terraform2kotlin.aws.schema

class aws_elasticache_replication_group(val replication_group_description : String, val replication_group_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var port: Int? = null
  var snapshot_window: String? = null
  var engine: String? = null
  var number_cache_clusters: Int? = null
  var snapshot_retention_limit: Int? = null
  var kms_key_id: String? = null
  var apply_immediately: Boolean? = null
  var automatic_failover_enabled: Boolean? = null
  var transit_encryption_enabled: Boolean? = null
  var auto_minor_version_upgrade: Boolean? = null
  var snapshot_arns: List<String>? = null
  var tags: Map<String, String>? = null
  var auth_token: String? = null
  var snapshot_name: String? = null
  var notification_topic_arn: String? = null
  var security_group_ids: List<String>? = null
  var subnet_group_name: String? = null
  var maintenance_window: String? = null
  var security_group_names: List<String>? = null
  var availability_zones: List<String>? = null
  var cluster_mode: List<Cluster_mode>? = null
  var engine_version: String? = null
  var at_rest_encryption_enabled: Boolean? = null
  var node_type: String? = null
  var parameter_group_name: String? = null
 


class Cluster_mode(val replicas_per_node_group : Int, val num_node_groups : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
