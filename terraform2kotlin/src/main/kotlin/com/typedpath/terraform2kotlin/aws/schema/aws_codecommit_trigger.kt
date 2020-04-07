package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_codecommit_trigger(val repository_name : String, val trigger : List<Trigger>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Trigger(val destination_arn : String, val events : List<String>, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var custom_data: String? = null
  var branches: List<String>? = null
 

}
}
