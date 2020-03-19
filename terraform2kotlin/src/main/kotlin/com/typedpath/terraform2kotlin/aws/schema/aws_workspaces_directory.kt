package com.typedpath.terraform2kotlin.aws.schema

class aws_workspaces_directory(val directory_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var self_service_permissions: List<Self_service_permissions>? = null
  var subnet_ids: List<String>? = null
  var tags: Map<String, String>? = null
 


class Self_service_permissions() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var change_compute_type: Boolean? = null
  var increase_volume_size: Boolean? = null
  var rebuild_workspace: Boolean? = null
  var restart_workspace: Boolean? = null
  var switch_running_mode: Boolean? = null
 

}
}
