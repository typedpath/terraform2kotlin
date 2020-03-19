package com.typedpath.terraform2kotlin.aws.schema

class aws_msk_cluster(val cluster_name : String, val broker_node_group_info : List<Broker_node_group_info>, val number_of_broker_nodes : Int, val kafka_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enhanced_monitoring: Enhanced_monitoring? = null
  var tags: Map<String, String>? = null
  var configuration_info: List<Configuration_info>? = null
  var encryption_info: List<Encryption_info>? = null
  var open_monitoring: List<Open_monitoring>? = null
  var client_authentication: List<Client_authentication>? = null
 

enum class Enhanced_monitoring(val theValue: String ) {
	 DEFAULT ("DEFAULT"), PER_BROKER ("PER_BROKER"), PER_TOPIC_PER_BROKER ("PER_TOPIC_PER_BROKER") ;
	override fun toString() = theValue
	}

class Broker_node_group_info(val client_subnets : List<String>, val instance_type : String, val security_groups : List<String>, val ebs_volume_size : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var az_distribution: Az_distribution? = null
 

enum class Az_distribution(val theValue: String ) {
	 DEFAULT ("DEFAULT") ;
	override fun toString() = theValue
	}
}

class Client_authentication() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tls: List<Tls>? = null
 


class Tls() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var certificate_authority_arns: List<String>? = null
 

}
}

class Configuration_info(val revision : Int, val arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

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
}
