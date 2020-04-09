package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dms_replication_task(val migration_type : Migration_type, val replication_task_id : String, val source_endpoint_arn : String, val target_endpoint_arn : String, val replication_instance_arn : String, val table_mappings : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var cdc_start_time: String? = null
  var replication_task_settings: String? = null
 

enum class Migration_type(val theValue: String ) {
	 full_load ("full-load"), cdc ("cdc"), full_load_and_cdc ("full-load-and-cdc") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
