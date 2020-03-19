package com.typedpath.terraform2kotlin.aws.schema

class aws_fsx_lustre_file_system(val storage_capacity : Int, val subnet_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var export_path: String? = null
  var imported_file_chunk_size: Int? = null
  var weekly_maintenance_start_time: String? = null
  var tags: Map<String, String>? = null
  var import_path: String? = null
  var security_group_ids: List<String>? = null
 

}
