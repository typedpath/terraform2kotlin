package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_gamelift_build(val operating_system : Operating_system, val storage_location : List<Storage_location>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var version: String? = null
 

enum class Operating_system(val theValue: String ) {
	 AMAZON_LINUX ("AMAZON_LINUX"), WINDOWS_2012 ("WINDOWS_2012") ;
	override fun toString() = theValue
	}

class Storage_location(val bucket : String, val key : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
