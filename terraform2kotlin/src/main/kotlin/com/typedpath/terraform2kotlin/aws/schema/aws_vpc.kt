package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpc(val cidr_block : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enable_dns_hostnames: Boolean? = null
  var enable_classiclink_dns_support: Boolean? = null
  var enable_dns_support: Boolean? = null
  var assign_generated_ipv6_cidr_block: Boolean? = null
  var tags: Map<String, String>? = null
  var instance_tenancy: Instance_tenancy? = null
  var enable_classiclink: Boolean? = null
 

enum class Instance_tenancy(val theValue: String ) {
	 default ("default"), dedicated ("dedicated") ;
	override fun toString() = theValue
	}
fun cidr_block_associationsRef(subPath: String = "") = ref(this, "cidr_block_associations", subPath)
fun ipv6_association_idRef(subPath: String = "") = ref(this, "ipv6_association_id", subPath)
fun cidr_blockRef(subPath: String = "") = ref(this, "cidr_block", subPath)
fun enable_dns_hostnamesRef(subPath: String = "") = ref(this, "enable_dns_hostnames", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun defaultRef(subPath: String = "") = ref(this, "default", subPath)
fun instance_tenancyRef(subPath: String = "") = ref(this, "instance_tenancy", subPath)
fun ipv6_cidr_blockRef(subPath: String = "") = ref(this, "ipv6_cidr_block", subPath)
fun main_route_table_idRef(subPath: String = "") = ref(this, "main_route_table_id", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun enable_dns_supportRef(subPath: String = "") = ref(this, "enable_dns_support", subPath)
fun dhcp_options_idRef(subPath: String = "") = ref(this, "dhcp_options_id", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
}
