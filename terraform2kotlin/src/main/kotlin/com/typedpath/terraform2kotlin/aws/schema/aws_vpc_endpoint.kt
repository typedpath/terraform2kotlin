package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_endpoint(val service_name : String, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_endpoint_type: Vpc_endpoint_type? = null
  var auto_accept: Boolean? = null
  var tags: Map<String, String>? = null
  var route_table_ids: List<String>? = null
  var security_group_ids: List<String>? = null
  var subnet_ids: List<String>? = null
  var policy: String? = null
  var private_dns_enabled: Boolean? = null
 

enum class Vpc_endpoint_type(val theValue: String ) {
	 Gateway ("Gateway"), Interface ("Interface") ;
	override fun toString() = theValue
	}
}
