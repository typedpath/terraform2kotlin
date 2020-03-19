package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_dhcp_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var domain_name: String? = null
  var domain_name_servers: List<String>? = null
  var ntp_servers: List<String>? = null
  var netbios_node_type: String? = null
  var netbios_name_servers: List<String>? = null
 

}
