package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_vpc_dhcp_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var netbios_name_servers: List<String>? = null
  var tags: Map<String, String>? = null
  var netbios_node_type: String? = null
 

}
