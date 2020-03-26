package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_transit_gateway_vpc_attachment_accepter(val transit_gateway_attachment_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var transit_gateway_default_route_table_propagation: Boolean? = null
  var tags: Map<String, String>? = null
  var transit_gateway_default_route_table_association: Boolean? = null
 

}
