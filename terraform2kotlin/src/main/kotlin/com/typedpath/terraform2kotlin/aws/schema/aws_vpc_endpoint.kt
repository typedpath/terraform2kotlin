package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpc_endpoint(val service_name : String, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var private_dns_enabled: Boolean? = null
  var route_table_ids: List<String>? = null
  var security_group_ids: List<String>? = null
  var subnet_ids: List<String>? = null
  var auto_accept: Boolean? = null
  var policy: String? = null
  var tags: Map<String, String>? = null
  var vpc_endpoint_type: Vpc_endpoint_type? = null
 

enum class Vpc_endpoint_type(val theValue: String ) {
	 Gateway ("Gateway"), Interface ("Interface") ;
	override fun toString() = theValue
	}
fun network_interface_idsRef(subPath: String = "") = ref(this, "network_interface_ids", subPath)
fun dns_entryRef(subPath: String = "") = ref(this, "dns_entry", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun subnet_idsRef(subPath: String = "") = ref(this, "subnet_ids", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun vpc_endpoint_typeRef(subPath: String = "") = ref(this, "vpc_endpoint_type", subPath)
fun cidr_blocksRef(subPath: String = "") = ref(this, "cidr_blocks", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun policyRef(subPath: String = "") = ref(this, "policy", subPath)
fun requester_managedRef(subPath: String = "") = ref(this, "requester_managed", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun prefix_list_idRef(subPath: String = "") = ref(this, "prefix_list_id", subPath)
fun private_dns_enabledRef(subPath: String = "") = ref(this, "private_dns_enabled", subPath)
fun route_table_idsRef(subPath: String = "") = ref(this, "route_table_ids", subPath)
fun security_group_idsRef(subPath: String = "") = ref(this, "security_group_ids", subPath)
fun service_nameRef(subPath: String = "") = ref(this, "service_name", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
