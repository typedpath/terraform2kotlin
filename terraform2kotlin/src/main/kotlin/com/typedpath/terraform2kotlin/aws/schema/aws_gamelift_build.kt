package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_gamelift_build(val name : String, val operating_system : Operating_system, val storage_location : List<Storage_location>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var version: String? = null
  var tags: Map<String, String>? = null
 

enum class Operating_system(val theValue: String ) {
	 AMAZON_LINUX ("AMAZON_LINUX"), WINDOWS_2012 ("WINDOWS_2012") ;
	override fun toString() = theValue
	}

class Storage_location(val key : String, val role_arn : String, val bucket : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
