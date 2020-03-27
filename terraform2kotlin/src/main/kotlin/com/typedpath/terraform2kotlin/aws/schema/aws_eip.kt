package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_eip() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var public_ipv4_pool: String? = null
  var tags: Map<String, String>? = null
  var vpc: Boolean? = null
  var instance: String? = null
  var associate_with_private_ip: String? = null
  var network_interface: String? = null
 

fun public_ipv4_poolRef(subPath: String = "") = ref(this, "public_ipv4_pool", subPath)
fun association_idRef(subPath: String = "") = ref(this, "association_id", subPath)
fun instance_idRef(subPath: String = "") = ref(this, "instance_id", subPath)
fun public_dnsRef(subPath: String = "") = ref(this, "public_dns", subPath)
fun network_interface_idRef(subPath: String = "") = ref(this, "network_interface_id", subPath)
fun network_interface_owner_idRef(subPath: String = "") = ref(this, "network_interface_owner_id", subPath)
fun private_ipRef(subPath: String = "") = ref(this, "private_ip", subPath)
fun private_dnsRef(subPath: String = "") = ref(this, "private_dns", subPath)
fun public_ipRef(subPath: String = "") = ref(this, "public_ip", subPath)
fun domainRef(subPath: String = "") = ref(this, "domain", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
}
