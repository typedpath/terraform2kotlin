package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_opsworks_memcached_layer(val stack_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var drain_elb_on_shutdown: Boolean? = null
  var ebs_volume: List<Ebs_volume>? = null
  var custom_deploy_recipes: List<String>? = null
  var custom_undeploy_recipes: List<String>? = null
  var custom_shutdown_recipes: List<String>? = null
  var auto_healing: Boolean? = null
  var custom_json: String? = null
  var instance_shutdown_timeout: Int? = null
  var allocated_memory: Int? = null
  var auto_assign_elastic_ips: Boolean? = null
  var auto_assign_public_ips: Boolean? = null
  var custom_instance_profile_arn: String? = null
  var custom_security_group_ids: List<String>? = null
  var custom_setup_recipes: List<String>? = null
  var install_updates_on_boot: Boolean? = null
  var name: String? = null
  var elastic_load_balancer: String? = null
  var custom_configure_recipes: List<String>? = null
  var system_packages: List<String>? = null
  var use_ebs_optimized_instances: Boolean? = null
 


class Ebs_volume(val number_of_disks : Int, val size : Int, val mount_point : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var raid_level: String? = null
  var type: String? = null
  var encrypted: Boolean? = null
 

}
}
