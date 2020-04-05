package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elasticsearch_domain(val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var access_policies: String? = null
  var snapshot_options: List<Snapshot_options>? = null
  var advanced_options: Map<String, String>? = null
  var tags: Map<String, String>? = null
  var node_to_node_encryption: List<Node_to_node_encryption>? = null
  var cluster_config: List<Cluster_config>? = null
  var cognito_options: List<Cognito_options>? = null
  var domain_endpoint_options: List<Domain_endpoint_options>? = null
  var ebs_options: List<Ebs_options>? = null
  var encrypt_at_rest: List<Encrypt_at_rest>? = null
  var vpc_options: List<Vpc_options>? = null
  var log_publishing_options: List<Log_publishing_options>? = null
  var elasticsearch_version: String? = null
 


class Snapshot_options(val automated_snapshot_start_hour : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Node_to_node_encryption(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Cluster_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var dedicated_master_count: Int? = null
  var dedicated_master_enabled: Boolean? = null
  var dedicated_master_type: String? = null
  var instance_count: Int? = null
  var instance_type: String? = null
  var zone_awareness_config: List<Zone_awareness_config>? = null
  var zone_awareness_enabled: Boolean? = null
 


class Zone_awareness_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var availability_zone_count: Int? = null
 

}
}

class Cognito_options(val identity_pool_id : String, val role_arn : String, val user_pool_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}

class Domain_endpoint_options(val enforce_https : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tls_security_policy: Tls_security_policy? = null
 

enum class Tls_security_policy(val theValue: String ) {
	 Policy_Min_TLS_1_0_2019_07 ("Policy-Min-TLS-1-0-2019-07"), Policy_Min_TLS_1_2_2019_07 ("Policy-Min-TLS-1-2-2019-07") ;
	override fun toString() = theValue
	}
}

class Vpc_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var security_group_ids: List<String>? = null
  var subnet_ids: List<String>? = null
 

}

class Ebs_options(val ebs_enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
 

}

class Encrypt_at_rest(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_id: String? = null
 

}

class Log_publishing_options(val log_type : Log_type, val cloudwatch_log_group_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

enum class Log_type(val theValue: String ) {
	 INDEX_SLOW_LOGS ("INDEX_SLOW_LOGS"), SEARCH_SLOW_LOGS ("SEARCH_SLOW_LOGS"), ES_APPLICATION_LOGS ("ES_APPLICATION_LOGS") ;
	override fun toString() = theValue
	}
}
fun advanced_optionsRef(subPath: String = "") = ref(this, "advanced_options", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun ebs_optionsRef(subPath: String = "") = ref(this, "ebs_options", subPath)
fun processingRef(subPath: String = "") = ref(this, "processing", subPath)
fun access_policiesRef(subPath: String = "") = ref(this, "access_policies", subPath)
fun kibana_endpointRef(subPath: String = "") = ref(this, "kibana_endpoint", subPath)
fun node_to_node_encryptionRef(subPath: String = "") = ref(this, "node_to_node_encryption", subPath)
fun log_publishing_optionsRef(subPath: String = "") = ref(this, "log_publishing_options", subPath)
fun cognito_optionsRef(subPath: String = "") = ref(this, "cognito_options", subPath)
fun vpc_optionsRef(subPath: String = "") = ref(this, "vpc_options", subPath)
fun elasticsearch_versionRef(subPath: String = "") = ref(this, "elasticsearch_version", subPath)
fun createdRef(subPath: String = "") = ref(this, "created", subPath)
fun domain_nameRef(subPath: String = "") = ref(this, "domain_name", subPath)
fun domain_idRef(subPath: String = "") = ref(this, "domain_id", subPath)
fun endpointRef(subPath: String = "") = ref(this, "endpoint", subPath)
fun cluster_configRef(subPath: String = "") = ref(this, "cluster_config", subPath)
fun snapshot_optionsRef(subPath: String = "") = ref(this, "snapshot_options", subPath)
fun encryption_at_restRef(subPath: String = "") = ref(this, "encryption_at_rest", subPath)
fun deletedRef(subPath: String = "") = ref(this, "deleted", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
}
