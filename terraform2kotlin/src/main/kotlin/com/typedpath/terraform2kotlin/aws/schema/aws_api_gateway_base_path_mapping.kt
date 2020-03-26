package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_base_path_mapping(val api_id : String, val domain_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var base_path: String? = null
  var stage_name: String? = null
 

}
