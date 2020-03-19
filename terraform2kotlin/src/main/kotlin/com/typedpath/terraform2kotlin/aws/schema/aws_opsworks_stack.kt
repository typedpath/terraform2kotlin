package com.typedpath.terraform2kotlin.aws.schema

class aws_opsworks_stack(val default_instance_profile_arn : String, val name : String, val service_role_arn : String, val region : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var configuration_manager_name: String? = null
  var configuration_manager_version: String? = null
  var use_custom_cookbooks: Boolean? = null
  var custom_cookbooks_source: List<Custom_cookbooks_source>? = null
  var default_subnet_id: String? = null
  var use_opsworks_security_groups: Boolean? = null
  var agent_version: String? = null
  var default_os: String? = null
  var tags: Map<String, String>? = null
  var vpc_id: String? = null
  var custom_json: String? = null
  var default_availability_zone: String? = null
  var color: String? = null
  var manage_berkshelf: Boolean? = null
  var berkshelf_version: String? = null
  var default_root_device_type: String? = null
  var default_ssh_key_name: String? = null
  var hostname_theme: String? = null
 


class Custom_cookbooks_source(val type : String, val url : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var password: String? = null
  var revision: String? = null
  var ssh_key: String? = null
  var username: String? = null
 

}
}
