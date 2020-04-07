package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elasticache_replication_group(val replication_group_id : String, val replication_group_description : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cluster_mode: List<Cluster_mode>? = null
  var snapshot_retention_limit: Int? = null
  var availability_zones: List<String>? = null
  var security_group_names: List<String>? = null
  var engine: String? = null
  var port: Int? = null
  var apply_immediately: Boolean? = null
  var at_rest_encryption_enabled: Boolean? = null
  var parameter_group_name: String? = null
  var transit_encryption_enabled: Boolean? = null
  var node_type: String? = null
  var snapshot_arns: List<String>? = null
  var subnet_group_name: String? = null
  var number_cache_clusters: Int? = null
  var kms_key_id: String? = null
  var snapshot_name: String? = null
  var tags: Map<String, String>? = null
  var auto_minor_version_upgrade: Boolean? = null
  var automatic_failover_enabled: Boolean? = null
  var maintenance_window: String? = null
  var security_group_ids: List<String>? = null
  var auth_token: String? = null
  var engine_version: String? = null
  var notification_topic_arn: String? = null
  var snapshot_window: String? = null
 


class Cluster_mode(val replicas_per_node_group : Int, val num_node_groups : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun member_clustersRef(subPath: String = "") = ref(this, "member_clusters", subPath)
fun node_typeRef(subPath: String = "") = ref(this, "node_type", subPath)
fun snapshot_windowRef(subPath: String = "") = ref(this, "snapshot_window", subPath)
fun snapshot_retention_limitRef(subPath: String = "") = ref(this, "snapshot_retention_limit", subPath)
fun replication_group_descriptionRef(subPath: String = "") = ref(this, "replication_group_description", subPath)
fun auth_token_enabledRef(subPath: String = "") = ref(this, "auth_token_enabled", subPath)
fun configuration_endpoint_addressRef(subPath: String = "") = ref(this, "configuration_endpoint_address", subPath)
fun primary_endpoint_addressRef(subPath: String = "") = ref(this, "primary_endpoint_address", subPath)
fun number_cache_clustersRef(subPath: String = "") = ref(this, "number_cache_clusters", subPath)
fun replication_group_idRef(subPath: String = "") = ref(this, "replication_group_id", subPath)
fun automatic_failover_enabledRef(subPath: String = "") = ref(this, "automatic_failover_enabled", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
}
