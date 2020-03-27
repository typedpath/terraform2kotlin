package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_autoscaling_group(val min_size : Int, val max_size : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var placement_group: String? = null
  var wait_for_elb_capacity: Int? = null
  var tag: List<Tag>? = null
  var max_instance_lifetime: Int? = null
  var desired_capacity: Int? = null
  var wait_for_capacity_timeout: String? = null
  var launch_configuration: String? = null
  var default_cooldown: Int? = null
  var launch_template: List<Launch_template>? = null
  var metrics_granularity: String? = null
  var tags: List<Map<String, String>>? = null
  var name: String? = null
  var force_delete: Boolean? = null
  var enabled_metrics: List<String>? = null
  var suspended_processes: List<String>? = null
  var target_group_arns: List<String>? = null
  var service_linked_role_arn: String? = null
  var load_balancers: List<String>? = null
  var termination_policies: List<String>? = null
  var mixed_instances_policy: List<Mixed_instances_policy>? = null
  var min_elb_capacity: Int? = null
  var health_check_grace_period: Int? = null
  var health_check_type: String? = null
  var availability_zones: List<String>? = null
  var vpc_zone_identifier: List<String>? = null
  var protect_from_scale_in: Boolean? = null
  var initial_lifecycle_hook: List<Initial_lifecycle_hook>? = null
  var name_prefix: String? = null
 


class Tag(val key : String, val value : String, val propagate_at_launch : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Launch_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var id: String? = null
  var name: String? = null
  var version: String? = null
 

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

class Initial_lifecycle_hook(val lifecycle_transition : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var notification_target_arn: String? = null
  var role_arn: String? = null
  var default_result: String? = null
  var heartbeat_timeout: Int? = null
  var notification_metadata: String? = null
 

}
fun placement_groupRef(subPath: String = "") = ref(this, "placement_group", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun launch_configurationRef(subPath: String = "") = ref(this, "launch_configuration", subPath)
fun health_check_grace_periodRef(subPath: String = "") = ref(this, "health_check_grace_period", subPath)
fun load_balancersRef(subPath: String = "") = ref(this, "load_balancers", subPath)
fun max_sizeRef(subPath: String = "") = ref(this, "max_size", subPath)
fun service_linked_role_arnRef(subPath: String = "") = ref(this, "service_linked_role_arn", subPath)
fun target_group_arnsRef(subPath: String = "") = ref(this, "target_group_arns", subPath)
fun termination_policiesRef(subPath: String = "") = ref(this, "termination_policies", subPath)
fun vpc_zone_identifierRef(subPath: String = "") = ref(this, "vpc_zone_identifier", subPath)
fun availability_zonesRef(subPath: String = "") = ref(this, "availability_zones", subPath)
fun default_cooldownRef(subPath: String = "") = ref(this, "default_cooldown", subPath)
fun desired_capacityRef(subPath: String = "") = ref(this, "desired_capacity", subPath)
fun health_check_typeRef(subPath: String = "") = ref(this, "health_check_type", subPath)
fun new_instances_protected_from_scale_inRef(subPath: String = "") = ref(this, "new_instances_protected_from_scale_in", subPath)
fun min_sizeRef(subPath: String = "") = ref(this, "min_size", subPath)
}
