package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_batch_job_queue(val compute_environments : List<String>, val name : String, val priority : Int, val state : State) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

enum class State(val theValue: String ) {
	 DISABLED ("DISABLED"), ENABLED ("ENABLED") ;
	override fun toString() = theValue
	}
fun nameRef(subPath: String = "") = ref(this, "name", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun status_reasonRef(subPath: String = "") = ref(this, "status_reason", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun priorityRef(subPath: String = "") = ref(this, "priority", subPath)
fun compute_environment_orderRef(subPath: String = "") = ref(this, "compute_environment_order", subPath)
}
