package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_gamelift_fleet(val name : String, val build_id : String, val ec2_instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var fleet_type: Fleet_type? = null
  var instance_role_arn: String? = null
  var ec2_inbound_permission: List<Ec2_inbound_permission>? = null
  var resource_creation_limit_policy: List<Resource_creation_limit_policy>? = null
  var tags: Map<String, String>? = null
  var runtime_configuration: List<Runtime_configuration>? = null
  var new_game_session_protection_policy: New_game_session_protection_policy? = null
  var metric_groups: List<String>? = null
  var description: String? = null
 

enum class Fleet_type(val theValue: String ) {
	 ON_DEMAND ("ON_DEMAND"), SPOT ("SPOT") ;
	override fun toString() = theValue
	}
enum class New_game_session_protection_policy(val theValue: String ) {
	 NoProtection ("NoProtection"), FullProtection ("FullProtection") ;
	override fun toString() = theValue
	}

class Ec2_inbound_permission(val to_port : Int, val from_port : Int, val ip_range : String, val protocol : Protocol) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Protocol(val theValue: String ) {
	 TCP ("TCP"), UDP ("UDP") ;
	override fun toString() = theValue
	}
}

class Resource_creation_limit_policy() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var new_game_sessions_per_creator: Int? = null
  var policy_period_in_minutes: Int? = null
 

}

class Runtime_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var server_process: List<Server_process>? = null
  var game_session_activation_timeout_seconds: Int? = null
  var max_concurrent_game_session_activations: Int? = null
 


class Server_process(val concurrent_executions : Int, val launch_path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var parameters: String? = null
 

}
}
}
