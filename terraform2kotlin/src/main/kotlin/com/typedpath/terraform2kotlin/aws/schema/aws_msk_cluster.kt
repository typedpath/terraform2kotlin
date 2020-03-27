package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_msk_cluster(val broker_node_group_info : List<Broker_node_group_info>, val cluster_name : String, val number_of_broker_nodes : Int, val kafka_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var configuration_info: List<Configuration_info>? = null
  var enhanced_monitoring: Enhanced_monitoring? = null
  var client_authentication: List<Client_authentication>? = null
  var encryption_info: List<Encryption_info>? = null
  var open_monitoring: List<Open_monitoring>? = null
 

enum class Enhanced_monitoring(val theValue: String ) {
	 DEFAULT ("DEFAULT"), PER_BROKER ("PER_BROKER"), PER_TOPIC_PER_BROKER ("PER_TOPIC_PER_BROKER") ;
	override fun toString() = theValue
	}

class Broker_node_group_info(val ebs_volume_size : Int, val client_subnets : List<String>, val instance_type : String, val security_groups : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var az_distribution: Az_distribution? = null
 

enum class Az_distribution(val theValue: String ) {
	 DEFAULT ("DEFAULT") ;
	override fun toString() = theValue
	}
}

class Configuration_info(val revision : Int, val arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Client_authentication() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tls: List<Tls>? = null
 


class Tls() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var certificate_authority_arns: List<String>? = null
 

}
}

class Encryption_info() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encryption_at_rest_kms_key_arn: String? = null
  var encryption_in_transit: List<Encryption_in_transit>? = null
 


class Encryption_in_transit() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var client_broker: Client_broker? = null
  var in_cluster: Boolean? = null
 

enum class Client_broker(val theValue: String ) {
	 PLAINTEXT ("PLAINTEXT"), TLS_PLAINTEXT ("TLS_PLAINTEXT"), TLS ("TLS") ;
	override fun toString() = theValue
	}
}
}

class Open_monitoring(val prometheus : List<Prometheus>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Prometheus() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var jmx_exporter: List<Jmx_exporter>? = null
  var node_exporter: List<Node_exporter>? = null
 


class Jmx_exporter(val enabled_in_broker : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Node_exporter(val enabled_in_broker : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
fun cluster_nameRef(subPath: String = "") = ref(this, "cluster_name", subPath)
fun kafka_versionRef(subPath: String = "") = ref(this, "kafka_version", subPath)
fun number_of_broker_nodesRef(subPath: String = "") = ref(this, "number_of_broker_nodes", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun zookeeper_connect_stringRef(subPath: String = "") = ref(this, "zookeeper_connect_string", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun bootstrap_brokersRef(subPath: String = "") = ref(this, "bootstrap_brokers", subPath)
fun bootstrap_brokers_tlsRef(subPath: String = "") = ref(this, "bootstrap_brokers_tls", subPath)
}
