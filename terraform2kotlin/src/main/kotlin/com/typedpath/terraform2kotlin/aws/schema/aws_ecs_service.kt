package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ecs_service(val name : String, val task_definition : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ordered_placement_strategy: List<Ordered_placement_strategy>? = null
  var health_check_grace_period_seconds: Int? = null
  var launch_type: Launch_type? = null
  var scheduling_strategy: Scheduling_strategy? = null
  var iam_role: String? = null
  var deployment_controller: List<Deployment_controller>? = null
  var deployment_minimum_healthy_percent: Int? = null
  var placement_strategy: List<Placement_strategy>? = null
  var placement_constraints: List<Placement_constraints>? = null
  var tags: Map<String, String>? = null
  var cluster: String? = null
  var desired_count: Int? = null
  var enable_ecs_managed_tags: Boolean? = null
  var load_balancer: List<Load_balancer>? = null
  var service_registries: List<Service_registries>? = null
  var platform_version: String? = null
  var network_configuration: List<Network_configuration>? = null
  var propagate_tags: Propagate_tags? = null
  var capacity_provider_strategy: List<Capacity_provider_strategy>? = null
  var deployment_maximum_percent: Int? = null
 

enum class Launch_type(val theValue: String ) {
	 EC2 ("EC2"), FARGATE ("FARGATE") ;
	override fun toString() = theValue
	}
enum class Scheduling_strategy(val theValue: String ) {
	 DAEMON ("DAEMON"), REPLICA ("REPLICA") ;
	override fun toString() = theValue
	}
enum class Propagate_tags(val theValue: String ) {
	 SERVICE ("SERVICE"), TASK_DEFINITION ("TASK_DEFINITION") ;
	override fun toString() = theValue
	}

class Ordered_placement_strategy(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var field: String? = null
 

}

class Deployment_controller() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 CODE_DEPLOY ("CODE_DEPLOY"), ECS ("ECS") ;
	override fun toString() = theValue
	}
}

class Placement_strategy(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var field: String? = null
 

enum class Type(val theValue: String ) {
	 binpack ("binpack"), random ("random"), spread ("spread") ;
	override fun toString() = theValue
	}
}

class Placement_constraints(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var expression: String? = null
 

enum class Type(val theValue: String ) {
	 distinctInstance ("distinctInstance"), memberOf ("memberOf") ;
	override fun toString() = theValue
	}
}

class Load_balancer(val container_name : String, val container_port : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var target_group_arn: String? = null
  var elb_name: String? = null
 

}

class Service_registries(val registry_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var container_port: Int? = null
  var port: Int? = null
  var container_name: String? = null
 

}

class Network_configuration(val subnets : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var assign_public_ip: Boolean? = null
  var security_groups: List<String>? = null
 

}

class Capacity_provider_strategy(val capacity_provider : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var base: Int? = null
  var weight: Int? = null
 

}
fun service_nameRef(subPath: String = "") = ref(this, "service_name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun cluster_arnRef(subPath: String = "") = ref(this, "cluster_arn", subPath)
fun desired_countRef(subPath: String = "") = ref(this, "desired_count", subPath)
fun launch_typeRef(subPath: String = "") = ref(this, "launch_type", subPath)
fun scheduling_strategyRef(subPath: String = "") = ref(this, "scheduling_strategy", subPath)
fun task_definitionRef(subPath: String = "") = ref(this, "task_definition", subPath)
}
