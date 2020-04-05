package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ecs_cluster(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var capacity_providers: List<String>? = null
  var default_capacity_provider_strategy: List<Default_capacity_provider_strategy>? = null
  var setting: List<Setting>? = null
 


class Default_capacity_provider_strategy(val capacity_provider : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var base: Int? = null
  var weight: Int? = null
 

}

class Setting(val name : Name, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Name(val theValue: String ) {
	 containerInsights ("containerInsights") ;
	override fun toString() = theValue
	}
}
fun settingRef(subPath: String = "") = ref(this, "setting", subPath)
fun cluster_nameRef(subPath: String = "") = ref(this, "cluster_name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun pending_tasks_countRef(subPath: String = "") = ref(this, "pending_tasks_count", subPath)
fun running_tasks_countRef(subPath: String = "") = ref(this, "running_tasks_count", subPath)
fun registered_container_instances_countRef(subPath: String = "") = ref(this, "registered_container_instances_count", subPath)
}
