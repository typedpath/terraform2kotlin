package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_batch_compute_environment(val type : Type, val service_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var compute_environment_name_prefix: String? = null
  var compute_environment_name: String? = null
  var compute_resources: List<Compute_resources>? = null
  var state: State? = null
 

enum class Type(val theValue: String ) {
	 MANAGED ("MANAGED"), UNMANAGED ("UNMANAGED") ;
	override fun toString() = theValue
	}
enum class State(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}

class Compute_resources(val instance_role : String, val security_group_ids : List<String>, val instance_type : List<String>, val max_vcpus : Int, val min_vcpus : Int, val subnets : List<String>, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var desired_vcpus: Int? = null
  var spot_iam_fleet_role: String? = null
  var tags: Map<String, String>? = null
  var image_id: String? = null
  var allocation_strategy: Allocation_strategy? = null
  var bid_percentage: Int? = null
  var ec2_key_pair: String? = null
  var launch_template: List<Launch_template>? = null
 

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
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun ecs_cluster_arnRef(subPath: String = "") = ref(this, "ecs_cluster_arn", subPath)
fun service_roleRef(subPath: String = "") = ref(this, "service_role", subPath)
fun typeRef(subPath: String = "") = ref(this, "type", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun status_reasonRef(subPath: String = "") = ref(this, "status_reason", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun compute_environment_nameRef(subPath: String = "") = ref(this, "compute_environment_name", subPath)
}
