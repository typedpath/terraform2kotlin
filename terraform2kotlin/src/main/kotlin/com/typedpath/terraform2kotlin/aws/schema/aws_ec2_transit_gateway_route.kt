package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_transit_gateway_route(val transit_gateway_route_table_id : String, val destination_cidr_block : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var blackhole: Boolean? = null
  var transit_gateway_attachment_id: String? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
