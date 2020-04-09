package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ecs_capacity_provider(val name : String, val auto_scaling_group_provider : List<Auto_scaling_group_provider>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Auto_scaling_group_provider(val auto_scaling_group_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var managed_termination_protection: Managed_termination_protection? = null
  var managed_scaling: List<Managed_scaling>? = null
 

enum class Managed_termination_protection(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}

class Managed_scaling() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var maximum_scaling_step_size: Int? = null
  var minimum_scaling_step_size: Int? = null
  var status: Status? = null
  var target_capacity: Int? = null
 

enum class Status(val theValue: String ) {
	 ENABLED ("ENABLED"), DISABLED ("DISABLED") ;
	override fun toString() = theValue
	}
}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
