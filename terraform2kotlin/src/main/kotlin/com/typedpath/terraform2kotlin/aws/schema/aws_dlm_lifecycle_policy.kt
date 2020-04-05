package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_dlm_lifecycle_policy(val description : String, val execution_role_arn : String, val policy_details : List<Policy_details>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var state: State? = null
  var tags: Map<String, String>? = null
 

enum class State(val theValue: String ) {
	 DISABLED ("DISABLED"), ENABLED ("ENABLED") ;
	override fun toString() = theValue
	}

class Policy_details(val schedule : List<Schedule>, val target_tags : Map<String, String>, val resource_types : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Schedule(val create_rule : List<Create_rule>, val name : String, val retain_rule : List<Retain_rule>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var tags_to_add: Map<String, String>? = null
  var copy_tags: Boolean? = null
 


class Create_rule(val interval : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var interval_unit: Interval_unit? = null
  var times: List<String>? = null
 

enum class Interval_unit(val theValue: String ) {
	 HOURS ("HOURS") ;
	override fun toString() = theValue
	}
}

class Retain_rule(val count : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}
