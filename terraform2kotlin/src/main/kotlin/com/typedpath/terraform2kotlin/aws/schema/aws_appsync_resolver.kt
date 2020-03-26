package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appsync_resolver(val request_template : String, val api_id : String, val response_template : String, val type : String, val field : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var data_source: String? = null
  var kind: Kind? = null
  var pipeline_config: List<Pipeline_config>? = null
 

enum class Kind(val theValue: String ) {
	 UNIT ("UNIT"), PIPELINE ("PIPELINE") ;
	override fun toString() = theValue
	}

class Pipeline_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var functions: List<String>? = null
 

}
}
