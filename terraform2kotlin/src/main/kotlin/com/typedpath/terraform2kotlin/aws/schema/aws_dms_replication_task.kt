package com.typedpath.terraform2kotlin.aws.schema

class aws_dms_replication_task(val replication_task_id : String, val replication_instance_arn : String, val source_endpoint_arn : String, val table_mappings : String, val target_endpoint_arn : String, val migration_type : Migration_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var cdc_start_time: String? = null
  var replication_task_settings: String? = null
 

enum class Migration_type(val theValue: String ) {
	 full_load ("full-load"), cdc ("cdc"), full_load_and_cdc ("full-load-and-cdc") ;
	override fun toString() = theValue
	}
}
