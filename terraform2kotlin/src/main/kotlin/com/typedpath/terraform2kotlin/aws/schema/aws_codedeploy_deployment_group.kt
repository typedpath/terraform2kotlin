package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codedeploy_deployment_group(val service_role_arn : String, val app_name : String, val deployment_group_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var on_premises_instance_tag_filter: List<On_premises_instance_tag_filter>? = null
  var auto_rollback_configuration: List<Auto_rollback_configuration>? = null
  var trigger_configuration: List<Trigger_configuration>? = null
  var blue_green_deployment_config: List<Blue_green_deployment_config>? = null
  var autoscaling_groups: List<String>? = null
  var ec2_tag_set: List<Ec2_tag_set>? = null
  var ecs_service: List<Ecs_service>? = null
  var alarm_configuration: List<Alarm_configuration>? = null
  var load_balancer_info: List<Load_balancer_info>? = null
  var deployment_style: List<Deployment_style>? = null
  var deployment_config_name: String? = null
  var ec2_tag_filter: List<Ec2_tag_filter>? = null
 


class Trigger_configuration(val trigger_events : List<Trigger_events>, val trigger_name : String, val trigger_target_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Trigger_events(val theValue: String ) {
	 DeploymentStart ("DeploymentStart"), DeploymentSuccess ("DeploymentSuccess"), DeploymentFailure ("DeploymentFailure"), DeploymentStop ("DeploymentStop"), DeploymentRollback ("DeploymentRollback"), DeploymentReady ("DeploymentReady"), InstanceStart ("InstanceStart"), InstanceSuccess ("InstanceSuccess"), InstanceFailure ("InstanceFailure"), InstanceReady ("InstanceReady") ;
	override fun toString() = theValue
	}
}

class Alarm_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var ignore_poll_alarm_failure: Boolean? = null
  var alarms: List<String>? = null
 

}

class Load_balancer_info() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var elb_info: List<Elb_info>? = null
  var target_group_info: List<Target_group_info>? = null
  var target_group_pair_info: List<Target_group_pair_info>? = null
 


class Elb_info() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
 

}

class Target_group_info() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
 

}

class Target_group_pair_info(val prod_traffic_route : List<Prod_traffic_route>, val target_group : List<Target_group>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var test_traffic_route: List<Test_traffic_route>? = null
 


class Prod_traffic_route(val listener_arns : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Target_group(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Test_traffic_route(val listener_arns : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}

class Deployment_style() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var deployment_option: Deployment_option? = null
  var deployment_type: Deployment_type? = null
 

enum class Deployment_option(val theValue: String ) {
	 WITH_TRAFFIC_CONTROL ("WITH_TRAFFIC_CONTROL"), WITHOUT_TRAFFIC_CONTROL ("WITHOUT_TRAFFIC_CONTROL") ;
	override fun toString() = theValue
	}
enum class Deployment_type(val theValue: String ) {
	 IN_PLACE ("IN_PLACE"), BLUE_GREEN ("BLUE_GREEN") ;
	override fun toString() = theValue
	}
}

class On_premises_instance_tag_filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var key: String? = null
  var type: String? = null
  var value: String? = null
 

}

class Auto_rollback_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var enabled: Boolean? = null
  var events: List<String>? = null
 

}

class Blue_green_deployment_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var terminate_blue_instances_on_deployment_success: List<Terminate_blue_instances_on_deployment_success>? = null
  var deployment_ready_option: List<Deployment_ready_option>? = null
  var green_fleet_provisioning_option: List<Green_fleet_provisioning_option>? = null
 


class Terminate_blue_instances_on_deployment_success() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var action: Action? = null
  var termination_wait_time_in_minutes: Int? = null
 

enum class Action(val theValue: String ) {
	 TERMINATE ("TERMINATE"), KEEP_ALIVE ("KEEP_ALIVE") ;
	override fun toString() = theValue
	}
}

class Deployment_ready_option() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var action_on_timeout: Action_on_timeout? = null
  var wait_time_in_minutes: Int? = null
 

enum class Action_on_timeout(val theValue: String ) {
	 CONTINUE_DEPLOYMENT ("CONTINUE_DEPLOYMENT"), STOP_DEPLOYMENT ("STOP_DEPLOYMENT") ;
	override fun toString() = theValue
	}
}

class Green_fleet_provisioning_option() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var action: Action? = null
 

enum class Action(val theValue: String ) {
	 DISCOVER_EXISTING ("DISCOVER_EXISTING"), COPY_AUTO_SCALING_GROUP ("COPY_AUTO_SCALING_GROUP") ;
	override fun toString() = theValue
	}
}
}

class Ec2_tag_set() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ec2_tag_filter: List<Ec2_tag_filter>? = null
 


class Ec2_tag_filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: String? = null
  var value: String? = null
  var key: String? = null
 

}
}

class Ecs_service(val service_name : String, val cluster_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Ec2_tag_filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var key: String? = null
  var type: String? = null
  var value: String? = null
 

}
}
