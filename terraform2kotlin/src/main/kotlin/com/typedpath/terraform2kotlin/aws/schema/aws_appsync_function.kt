package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appsync_function(val name : String, val response_mapping_template : String, val api_id : String, val data_source : String, val request_mapping_template : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var function_version: Function_version? = null
 

enum class Function_version(val theValue: String ) {
	 _2018_05_29 ("2018-05-29") ;
	override fun toString() = theValue
	}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
