package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_backup_plan(val name : String, val rule : List<Rule>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Rule(val rule_name : String, val target_vault_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var schedule: String? = null
  var start_window: Int? = null
  var completion_window: Int? = null
  var lifecycle: List<Lifecycle>? = null
  var recovery_point_tags: Map<String, String>? = null
 


class Lifecycle() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cold_storage_after: Int? = null
  var delete_after: Int? = null
 

}
}
}
