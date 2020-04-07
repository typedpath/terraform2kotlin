package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_transit_gateway_route_table(val transit_gateway_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

fun default_association_route_tableRef(subPath: String = "") = ref(this, "default_association_route_table", subPath)
fun default_propagation_route_tableRef(subPath: String = "") = ref(this, "default_propagation_route_table", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun transit_gateway_idRef(subPath: String = "") = ref(this, "transit_gateway_id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
}
