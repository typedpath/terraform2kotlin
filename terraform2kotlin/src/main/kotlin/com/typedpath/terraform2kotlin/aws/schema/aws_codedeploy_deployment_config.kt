package com.typedpath.terraform2kotlin.aws.schema

class aws_codedeploy_deployment_config(val deployment_config_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var compute_platform: Compute_platform? = null
  var minimum_healthy_hosts: List<Minimum_healthy_hosts>? = null
  var traffic_routing_config: List<Traffic_routing_config>? = null
 

enum class Compute_platform(val theValue: String ) {
	 Server ("Server"), Lambda ("Lambda"), ECS ("ECS") ;
	override fun toString() = theValue
	}

class Minimum_healthy_hosts() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var value: Int? = null
  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 HOST_COUNT ("HOST_COUNT"), FLEET_PERCENT ("FLEET_PERCENT") ;
	override fun toString() = theValue
	}
}

class Traffic_routing_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
  var time_based_canary: List<Time_based_canary>? = null
  var time_based_linear: List<Time_based_linear>? = null
 

enum class Type(val theValue: String ) {
	 AllAtOnce ("AllAtOnce"), TimeBasedCanary ("TimeBasedCanary"), TimeBasedLinear ("TimeBasedLinear") ;
	override fun toString() = theValue
	}

class Time_based_canary() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var interval: Int? = null
  var percentage: Int? = null
 

}

class Time_based_linear() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var interval: Int? = null
  var percentage: Int? = null
 

}
}
}
