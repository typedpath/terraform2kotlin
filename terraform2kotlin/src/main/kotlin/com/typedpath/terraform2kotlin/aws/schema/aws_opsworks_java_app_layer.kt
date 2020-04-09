package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_opsworks_java_app_layer(val stack_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var auto_assign_public_ips: Boolean? = null
  var custom_instance_profile_arn: String? = null
  var custom_setup_recipes: List<String>? = null
  var install_updates_on_boot: Boolean? = null
  var use_ebs_optimized_instances: Boolean? = null
  var ebs_volume: List<Ebs_volume>? = null
  var jvm_options: String? = null
  var jvm_version: String? = null
  var elastic_load_balancer: String? = null
  var custom_deploy_recipes: List<String>? = null
  var custom_configure_recipes: List<String>? = null
  var custom_undeploy_recipes: List<String>? = null
  var auto_healing: Boolean? = null
  var instance_shutdown_timeout: Int? = null
  var drain_elb_on_shutdown: Boolean? = null
  var name: String? = null
  var app_server_version: String? = null
  var jvm_type: String? = null
  var auto_assign_elastic_ips: Boolean? = null
  var custom_shutdown_recipes: List<String>? = null
  var custom_security_group_ids: List<String>? = null
  var custom_json: String? = null
  var system_packages: List<String>? = null
  var app_server: String? = null
 


class Ebs_volume(val mount_point : String, val number_of_disks : Int, val size : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var raid_level: String? = null
  var type: String? = null
  var encrypted: Boolean? = null
  var iops: Int? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
