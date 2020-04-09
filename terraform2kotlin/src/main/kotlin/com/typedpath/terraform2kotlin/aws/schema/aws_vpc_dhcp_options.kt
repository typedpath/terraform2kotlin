package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpc_dhcp_options() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var netbios_name_servers: List<String>? = null
  var tags: Map<String, String>? = null
  var domain_name: String? = null
  var domain_name_servers: List<String>? = null
  var ntp_servers: List<String>? = null
  var netbios_node_type: String? = null
 

fun netbios_name_serversRef(subPath: String = "") = ref(this, "netbios_name_servers", subPath)
fun ntp_serversRef(subPath: String = "") = ref(this, "ntp_servers", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun dhcp_options_idRef(subPath: String = "") = ref(this, "dhcp_options_id", subPath)
fun domain_name_serversRef(subPath: String = "") = ref(this, "domain_name_servers", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun domain_nameRef(subPath: String = "") = ref(this, "domain_name", subPath)
fun netbios_node_typeRef(subPath: String = "") = ref(this, "netbios_node_type", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
