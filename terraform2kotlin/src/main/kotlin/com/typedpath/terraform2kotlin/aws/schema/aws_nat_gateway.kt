package com.typedpath.terraform2kotlin.aws.schema

class aws_nat_gateway(val subnet_id : String, val allocation_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
