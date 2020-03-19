package com.typedpath.terraform2kotlin.aws.schema

class aws_autoscaling_group(val min_size : Int, val max_size : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var min_elb_capacity: Int? = null
  var default_cooldown: Int? = null
  var force_delete: Boolean? = null
  var wait_for_capacity_timeout: String? = null
  var name: String? = null
  var metrics_granularity: String? = null
  var max_instance_lifetime: Int? = null
  var health_check_grace_period: Int? = null
  var load_balancers: List<String>? = null
  var suspended_processes: List<String>? = null
  var service_linked_role_arn: String? = null
  var desired_capacity: Int? = null
  var protect_from_scale_in: Boolean? = null
  var tags: List<Map<String, String>>? = null
  var wait_for_elb_capacity: Int? = null
  var placement_group: String? = null
  var initial_lifecycle_hook: List<Initial_lifecycle_hook>? = null
  var launch_template: List<Launch_template>? = null
  var health_check_type: String? = null
  var vpc_zone_identifier: List<String>? = null
  var target_group_arns: List<String>? = null
  var tag: List<Tag>? = null
  var launch_configuration: String? = null
  var availability_zones: List<String>? = null
  var enabled_metrics: List<String>? = null
  var mixed_instances_policy: List<Mixed_instances_policy>? = null
  var termination_policies: List<String>? = null
 


class Initial_lifecycle_hook(val lifecycle_transition : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var notification_metadata: String? = null
  var notification_target_arn: String? = null
  var role_arn: String? = null
  var default_result: String? = null
  var heartbeat_timeout: Int? = null
 

}

class Launch_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var id: String? = null
  var name: String? = null
  var version: String? = null
 

}

class Tag(val key : String, val value : String, val propagate_at_launch : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Mixed_instances_policy(val launch_template : List<Launch_template>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var instances_distribution: List<Instances_distribution>? = null
 


class Launch_template(val launch_template_specification : List<Launch_template_specification>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var override: List<Override>? = null
 


class Launch_template_specification() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var version: String? = null
  var launch_template_id: String? = null
  var launch_template_name: String? = null
 

}

class Override() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var instance_type: String? = null
  var weighted_capacity: String? = null
 

}
}

class Instances_distribution() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var spot_allocation_strategy: String? = null
  var spot_instance_pools: Int? = null
  var spot_max_price: String? = null
  var on_demand_allocation_strategy: String? = null
  var on_demand_base_capacity: Int? = null
  var on_demand_percentage_above_base_capacity: Int? = null
 

}
}
}
