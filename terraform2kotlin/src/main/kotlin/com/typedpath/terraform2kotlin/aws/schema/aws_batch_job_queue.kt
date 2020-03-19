package com.typedpath.terraform2kotlin.aws.schema

class aws_batch_job_queue(val compute_environments : List<String>, val name : String, val priority : Int, val state : State) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

enum class State(val theValue: String ) {
	 DISABLED ("DISABLED"), ENABLED ("ENABLED") ;
	override fun toString() = theValue
	}
}
