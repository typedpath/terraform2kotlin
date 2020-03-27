package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_spot_fleet_request(val launch_specification : List<Launch_specification>, val target_capacity : Int, val iam_fleet_role : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var allocation_strategy: String? = null
  var instance_pools_to_use_count: Int? = null
  var excess_capacity_termination_policy: Excess_capacity_termination_policy? = null
  var valid_from: String? = null
  var replace_unhealthy_instances: Boolean? = null
  var terminate_instances_with_expiration: Boolean? = null
  var fleet_type: Fleet_type? = null
  var target_group_arns: List<String>? = null
  var load_balancers: List<String>? = null
  var wait_for_fulfillment: Boolean? = null
  var instance_interruption_behaviour: String? = null
  var spot_price: String? = null
  var valid_until: String? = null
 

enum class Excess_capacity_termination_policy(val theValue: String ) {
	 Default ("Default"), NoTermination ("NoTermination") ;
	override fun toString() = theValue
	}
enum class Fleet_type(val theValue: String ) {
	 maintain ("maintain"), request ("request") ;
	override fun toString() = theValue
	}

class Launch_specification(val instance_type : String, val ami : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var ebs_optimized: Boolean? = null
  var monitoring: Boolean? = null
  var availability_zone: String? = null
  var tags: Map<String, String>? = null
  var subnet_id: String? = null
  var iam_instance_profile_arn: String? = null
  var key_name: String? = null
  var placement_group: String? = null
  var spot_price: String? = null
  var user_data: String? = null
  var weighted_capacity: String? = null
  var ephemeral_block_device: List<Ephemeral_block_device>? = null
  var root_block_device: List<Root_block_device>? = null
  var vpc_security_group_ids: List<String>? = null
  var associate_public_ip_address: Boolean? = null
  var ebs_block_device: List<Ebs_block_device>? = null
  var iam_instance_profile: String? = null
  var placement_tenancy: String? = null
 


class Ephemeral_block_device(val device_name : String, val virtual_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Root_block_device() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var encrypted: Boolean? = null
  var iops: Int? = null
  var kms_key_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
 

}

class Ebs_block_device(val device_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var kms_key_id: String? = null
  var snapshot_id: String? = null
  var volume_size: Int? = null
  var volume_type: String? = null
  var delete_on_termination: Boolean? = null
  var encrypted: Boolean? = null
  var iops: Int? = null
 

}
}
}
