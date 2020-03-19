package com.typedpath.terraform2kotlin.aws.schema

class aws_efs_mount_target(val subnet_id : String, val file_system_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ip_address: String? = null
  var security_groups: List<String>? = null
 

}
