package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codedeploy_app(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var compute_platform: Compute_platform? = null
  var unique_id: String? = null
 

enum class Compute_platform(val theValue: String ) {
	 ECS ("ECS"), Lambda ("Lambda"), Server ("Server") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
