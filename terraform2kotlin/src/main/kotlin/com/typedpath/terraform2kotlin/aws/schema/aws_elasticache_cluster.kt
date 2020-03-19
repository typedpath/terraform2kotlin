package com.typedpath.terraform2kotlin.aws.schema

class aws_elasticache_cluster(val cluster_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var node_type: String? = null
  var maintenance_window: String? = null
  var tags: Map<String, String>? = null
  var parameter_group_name: String? = null
  var port: Int? = null
  var availability_zones: List<String>? = null
  var az_mode: Az_mode? = null
  var notification_topic_arn: String? = null
  var num_cache_nodes: Int? = null
  var snapshot_retention_limit: Int? = null
  var snapshot_name: String? = null
  var replication_group_id: String? = null
  var security_group_names: List<String>? = null
  var security_group_ids: List<String>? = null
  var apply_immediately: Boolean? = null
  var engine_version: String? = null
  var snapshot_window: String? = null
  var engine: String? = null
  var preferred_availability_zones: List<String>? = null
  var subnet_group_name: String? = null
  var snapshot_arns: List<String>? = null
 

enum class Az_mode(val theValue: String ) {
	 cross_az ("cross-az"), single_az ("single-az") ;
	override fun toString() = theValue
	}
}
