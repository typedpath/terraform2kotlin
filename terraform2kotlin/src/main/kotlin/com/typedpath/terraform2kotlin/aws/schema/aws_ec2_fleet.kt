package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_fleet(val launch_template_config : List<Launch_template_config>, val target_capacity_specification : List<Target_capacity_specification>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var excess_capacity_termination_policy: Excess_capacity_termination_policy? = null
  var on_demand_options: List<On_demand_options>? = null
  var spot_options: List<Spot_options>? = null
  var tags: Map<String, String>? = null
  var terminate_instances: Boolean? = null
  var terminate_instances_with_expiration: Boolean? = null
  var type: Type? = null
  var replace_unhealthy_instances: Boolean? = null
 

enum class Excess_capacity_termination_policy(val theValue: String ) {
	 no_termination ("no-termination"), termination ("termination") ;
	override fun toString() = theValue
	}
enum class Type(val theValue: String ) {
	 maintain ("maintain"), request ("request") ;
	override fun toString() = theValue
	}

class Launch_template_config(val launch_template_specification : List<Launch_template_specification>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var override: List<Override>? = null
 


class Launch_template_specification(val version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var launch_template_name: String? = null
  var launch_template_id: String? = null
 

}

class Override() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var weighted_capacity: Float? = null
  var availability_zone: String? = null
  var instance_type: String? = null
  var max_price: String? = null
  var priority: Float? = null
  var subnet_id: String? = null
 

}
}

class Target_capacity_specification(val default_target_capacity_type : Default_target_capacity_type, val total_target_capacity : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var on_demand_target_capacity: Int? = null
  var spot_target_capacity: Int? = null
 

enum class Default_target_capacity_type(val theValue: String ) {
	 on_demand ("on-demand"), spot ("spot") ;
	override fun toString() = theValue
	}
}

class On_demand_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var allocation_strategy: Allocation_strategy? = null
 

enum class Allocation_strategy(val theValue: String ) {
	 lowestPrice ("lowestPrice"), prioritized ("prioritized") ;
	override fun toString() = theValue
	}
}

class Spot_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var instance_pools_to_use_count: Int? = null
  var allocation_strategy: Allocation_strategy? = null
  var instance_interruption_behavior: Instance_interruption_behavior? = null
 

enum class Allocation_strategy(val theValue: String ) {
	 diversified ("diversified"), lowestPrice ("lowestPrice") ;
	override fun toString() = theValue
	}
enum class Instance_interruption_behavior(val theValue: String ) {
	 hibernate ("hibernate"), stop ("stop"), terminate ("terminate") ;
	override fun toString() = theValue
	}
}
}
