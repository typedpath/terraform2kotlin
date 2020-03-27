package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_efs_mount_target(val file_system_id : String, val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var ip_address: String? = null
  var security_groups: List<String>? = null
 

fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun subnet_idRef(subPath: String = "") = ref(this, "subnet_id", subPath)
fun network_interface_idRef(subPath: String = "") = ref(this, "network_interface_id", subPath)
fun dns_nameRef(subPath: String = "") = ref(this, "dns_name", subPath)
fun mount_target_idRef(subPath: String = "") = ref(this, "mount_target_id", subPath)
fun file_system_arnRef(subPath: String = "") = ref(this, "file_system_arn", subPath)
fun file_system_idRef(subPath: String = "") = ref(this, "file_system_id", subPath)
fun ip_addressRef(subPath: String = "") = ref(this, "ip_address", subPath)
}
