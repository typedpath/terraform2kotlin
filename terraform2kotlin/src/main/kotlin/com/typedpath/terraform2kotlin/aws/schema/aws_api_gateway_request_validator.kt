package com.typedpath.terraform2kotlin.aws.schema

class aws_api_gateway_request_validator(val rest_api_id : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var validate_request_body: Boolean? = null
  var validate_request_parameters: Boolean? = null
 

}
