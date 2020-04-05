package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elasticache_cluster(val cluster_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var num_cache_nodes: Int? = null
  var apply_immediately: Boolean? = null
  var subnet_group_name: String? = null
  var snapshot_window: String? = null
  var snapshot_name: String? = null
  var node_type: String? = null
  var engine: String? = null
  var maintenance_window: String? = null
  var notification_topic_arn: String? = null
  var snapshot_arns: List<String>? = null
  var availability_zones: List<String>? = null
  var az_mode: Az_mode? = null
  var parameter_group_name: String? = null
  var port: Int? = null
  var security_group_ids: List<String>? = null
  var snapshot_retention_limit: Int? = null
  var tags: Map<String, String>? = null
  var replication_group_id: String? = null
  var engine_version: String? = null
  var preferred_availability_zones: List<String>? = null
  var security_group_names: List<String>? = null
 

enum class Az_mode(val theValue: String ) {
	 cross_az ("cross-az"), single_az ("single-az") ;
	override fun toString() = theValue
	}
fun engineRef(subPath: String = "") = ref(this, "engine", subPath)
fun replication_group_idRef(subPath: String = "") = ref(this, "replication_group_id", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun cache_nodesRef(subPath: String = "") = ref(this, "cache_nodes", subPath)
fun subnet_group_nameRef(subPath: String = "") = ref(this, "subnet_group_name", subPath)
fun num_cache_nodesRef(subPath: String = "") = ref(this, "num_cache_nodes", subPath)
fun security_group_idsRef(subPath: String = "") = ref(this, "security_group_ids", subPath)
fun maintenance_windowRef(subPath: String = "") = ref(this, "maintenance_window", subPath)
fun cluster_addressRef(subPath: String = "") = ref(this, "cluster_address", subPath)
fun node_typeRef(subPath: String = "") = ref(this, "node_type", subPath)
fun snapshot_retention_limitRef(subPath: String = "") = ref(this, "snapshot_retention_limit", subPath)
fun portRef(subPath: String = "") = ref(this, "port", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun snapshot_windowRef(subPath: String = "") = ref(this, "snapshot_window", subPath)
fun engine_versionRef(subPath: String = "") = ref(this, "engine_version", subPath)
fun parameter_group_nameRef(subPath: String = "") = ref(this, "parameter_group_name", subPath)
fun security_group_namesRef(subPath: String = "") = ref(this, "security_group_names", subPath)
fun notification_topic_arnRef(subPath: String = "") = ref(this, "notification_topic_arn", subPath)
fun configuration_endpointRef(subPath: String = "") = ref(this, "configuration_endpoint", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun cluster_idRef(subPath: String = "") = ref(this, "cluster_id", subPath)
}
