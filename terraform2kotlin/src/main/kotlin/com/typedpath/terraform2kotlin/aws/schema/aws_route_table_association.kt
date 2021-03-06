package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_route_table_association(val route_table_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var gateway_id: String? = null
  var subnet_id: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
