package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_endpoint_service(val acceptance_required : Boolean, val network_load_balancer_arns : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var allowed_principals: List<String>? = null
 

}
