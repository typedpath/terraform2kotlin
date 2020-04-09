package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_glue_job(val command : List<Command>, val name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var connections: List<String>? = null
  var default_arguments: Map<String, String>? = null
  var glue_version: String? = null
  var max_capacity: Float? = null
  var timeout: Int? = null
  var description: String? = null
  var notification_property: List<Notification_property>? = null
  var allocated_capacity: Int? = null
  var max_retries: Int? = null
  var security_configuration: String? = null
  var execution_property: List<Execution_property>? = null
  var tags: Map<String, String>? = null
  var worker_type: Worker_type? = null
  var number_of_workers: Int? = null
 

enum class Worker_type(val theValue: String ) {
	 G_1X ("G.1X"), G_2X ("G.2X"), Standard ("Standard") ;
	override fun toString() = theValue
	}

class Command(val script_location : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
  var python_version: Python_version? = null
 

enum class Python_version(val theValue: String ) {
	 _2 ("2"), _3 ("3") ;
	override fun toString() = theValue
	}
}

class Execution_property() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var max_concurrent_runs: Int? = null
 

}

class Notification_property() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var notify_delay_after: Int? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
