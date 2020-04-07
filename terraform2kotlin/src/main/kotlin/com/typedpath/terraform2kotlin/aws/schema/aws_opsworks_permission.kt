package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_opsworks_permission(val user_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var stack_id: String? = null
  var allow_ssh: Boolean? = null
  var allow_sudo: Boolean? = null
  var level: Level? = null
 

enum class Level(val theValue: String ) {
	 deny ("deny"), show ("show"), deploy ("deploy"), manage ("manage"), iam_only ("iam_only") ;
	override fun toString() = theValue
	}
}
