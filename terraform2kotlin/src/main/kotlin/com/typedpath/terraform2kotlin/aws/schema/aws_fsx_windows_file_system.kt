package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_fsx_windows_file_system(val subnet_ids : List<String>, val throughput_capacity : Int, val storage_capacity : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var copy_tags_to_backups: Boolean? = null
  var kms_key_id: String? = null
  var active_directory_id: String? = null
  var automatic_backup_retention_days: Int? = null
  var self_managed_active_directory: List<Self_managed_active_directory>? = null
  var daily_automatic_backup_start_time: String? = null
  var skip_final_backup: Boolean? = null
  var weekly_maintenance_start_time: String? = null
  var security_group_ids: List<String>? = null
  var tags: Map<String, String>? = null
 


class Self_managed_active_directory(val password : String, val username : String, val dns_ips : List<String>, val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var file_system_administrators_group: String? = null
  var organizational_unit_distinguished_name: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
