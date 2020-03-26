package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_organizations_policy(val content : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 SERVICE_CONTROL_POLICY ("SERVICE_CONTROL_POLICY"), TAG_POLICY ("TAG_POLICY") ;
	override fun toString() = theValue
	}
}
