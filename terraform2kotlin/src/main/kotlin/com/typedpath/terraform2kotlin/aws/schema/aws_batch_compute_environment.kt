package com.typedpath.terraform2kotlin.aws.schema

class aws_batch_compute_environment(val service_role : String, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var compute_environment_name_prefix: String? = null
  var state: State? = null
  var compute_environment_name: String? = null
  var compute_resources: List<Compute_resources>? = null
 

enum class Type(val theValue: String ) {
	 MANAGED ("MANAGED"), UNMANAGED ("UNMANAGED") ;
	override fun toString() = theValue
	}
enum class State(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}

class Compute_resources(val instance_type : List<String>, val max_vcpus : Int, val min_vcpus : Int, val security_group_ids : List<String>, val subnets : List<String>, val type : Type, val instance_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tags: Map<String, String>? = null
  var allocation_strategy: Allocation_strategy? = null
  var bid_percentage: Int? = null
  var ec2_key_pair: String? = null
  var launch_template: List<Launch_template>? = null
  var spot_iam_fleet_role: String? = null
  var desired_vcpus: Int? = null
  var image_id: String? = null
 

enum class Type(val theValue: String ) {
	 EC2 ("EC2"), SPOT ("SPOT") ;
	override fun toString() = theValue
	}
enum class Allocation_strategy(val theValue: String ) {
	 BEST_FIT ("BEST_FIT"), BEST_FIT_PROGRESSIVE ("BEST_FIT_PROGRESSIVE"), SPOT_CAPACITY_OPTIMIZED ("SPOT_CAPACITY_OPTIMIZED") ;
	override fun toString() = theValue
	}

class Launch_template() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var launch_template_id: String? = null
  var launch_template_name: String? = null
  var version: String? = null
 

}
}
}
