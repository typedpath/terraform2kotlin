package com.typedpath.terraform2kotlin.aws.schema

class aws_route_table_association(val route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var subnet_id: String? = null
  var gateway_id: String? = null
 

}
