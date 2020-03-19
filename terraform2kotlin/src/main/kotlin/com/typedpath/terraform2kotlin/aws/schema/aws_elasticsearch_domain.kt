package com.typedpath.terraform2kotlin.aws.schema

class aws_elasticsearch_domain(val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var encrypt_at_rest: List<Encrypt_at_rest>? = null
  var snapshot_options: List<Snapshot_options>? = null
  var cognito_options: List<Cognito_options>? = null
  var node_to_node_encryption: List<Node_to_node_encryption>? = null
  var cluster_config: List<Cluster_config>? = null
  var vpc_options: List<Vpc_options>? = null
  var elasticsearch_version: String? = null
  var ebs_options: List<Ebs_options>? = null
  var advanced_options: Map<String, String>? = null
  var log_publishing_options: List<Log_publishing_options>? = null
  var tags: Map<String, String>? = null
  var access_policies: String? = null
  var domain_endpoint_options: List<Domain_endpoint_options>? = null
 


class Snapshot_options(val automated_snapshot_start_hour : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Cluster_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var zone_awareness_config: List<Zone_awareness_config>? = null
  var zone_awareness_enabled: Boolean? = null
  var dedicated_master_count: Int? = null
  var dedicated_master_enabled: Boolean? = null
  var dedicated_master_type: String? = null
  var instance_count: Int? = null
  var instance_type: String? = null
 


class Zone_awareness_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var availability_zone_count: Int? = null
 

}
}

class Vpc_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var security_group_ids: List<String>? = null
  var subnet_ids: List<String>? = null
 

}

class Domain_endpoint_options(val enforce_https : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tls_security_policy: Tls_security_policy? = null
 

enum class Tls_security_policy(val theValue: String ) {
	 Policy_Min_TLS_1_0_2019_07 ("Policy-Min-TLS-1-0-2019-07"), Policy_Min_TLS_1_2_2019_07 ("Policy-Min-TLS-1-2-2019-07") ;
	override fun toString() = theValue
	}
}

class Log_publishing_options(val log_type : Log_type, val cloudwatch_log_group_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

enum class Log_type(val theValue: String ) {
	 INDEX_SLOW_LOGS ("INDEX_SLOW_LOGS"), SEARCH_SLOW_LOGS ("SEARCH_SLOW_LOGS"), ES_APPLICATION_LOGS ("ES_APPLICATION_LOGS") ;
	override fun toString() = theValue
	}
}

class Encrypt_at_rest(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_id: String? = null
 

}

class Cognito_options(val user_pool_id : String, val identity_pool_id : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
 

}

class Node_to_node_encryption(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ebs_options(val ebs_enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var volume_size: Int? = null
  var volume_type: String? = null
 

}
}
