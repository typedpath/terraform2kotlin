package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codecommit_trigger(val trigger : List<Trigger>, val repository_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Trigger(val name : String, val destination_arn : String, val events : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var custom_data: String? = null
  var branches: List<String>? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
