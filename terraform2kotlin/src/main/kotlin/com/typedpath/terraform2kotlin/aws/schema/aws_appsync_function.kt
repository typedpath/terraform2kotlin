package com.typedpath.terraform2kotlin.aws.schema

class aws_appsync_function(val api_id : String, val data_source : String, val name : String, val request_mapping_template : String, val response_mapping_template : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var function_version: Function_version? = null
  var description: String? = null
 

enum class Function_version(val theValue: String ) {
	 _2018_05_29 ("2018-05-29") ;
	override fun toString() = theValue
	}
}
