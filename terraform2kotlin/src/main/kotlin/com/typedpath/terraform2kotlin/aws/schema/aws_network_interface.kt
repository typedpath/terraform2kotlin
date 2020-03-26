package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_network_interface(val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var security_groups: List<String>? = null
  var source_dest_check: Boolean? = null
  var attachment: List<Attachment>? = null
  var tags: Map<String, String>? = null
  var private_ip: String? = null
  var private_ips_count: Int? = null
  var description: String? = null
  var private_ips: List<String>? = null
 


class Attachment(val instance : String, val device_index : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
fun associationRef(subPath: String = "") = ref(this, "association", subPath)
fun attachmentRef(subPath: String = "") = ref(this, "attachment", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun interface_typeRef(subPath: String = "") = ref(this, "interface_type", subPath)
fun private_dns_nameRef(subPath: String = "") = ref(this, "private_dns_name", subPath)
fun subnet_idRef(subPath: String = "") = ref(this, "subnet_id", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun descriptionRef(subPath: String = "") = ref(this, "description", subPath)
fun security_groupsRef(subPath: String = "") = ref(this, "security_groups", subPath)
fun mac_addressRef(subPath: String = "") = ref(this, "mac_address", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun private_ipsRef(subPath: String = "") = ref(this, "private_ips", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun ipv6_addressesRef(subPath: String = "") = ref(this, "ipv6_addresses", subPath)
fun private_ipRef(subPath: String = "") = ref(this, "private_ip", subPath)
fun requester_idRef(subPath: String = "") = ref(this, "requester_id", subPath)
}
