package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_subnet(val cidr_block : String, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var availability_zone: String? = null
  var availability_zone_id: String? = null
  var ipv6_cidr_block: String? = null
  var map_public_ip_on_launch: Boolean? = null
  var assign_ipv6_address_on_creation: Boolean? = null
  var tags: Map<String, String>? = null
 

fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun assign_ipv6_address_on_creationRef(subPath: String = "") = ref(this, "assign_ipv6_address_on_creation", subPath)
fun map_public_ip_on_launchRef(subPath: String = "") = ref(this, "map_public_ip_on_launch", subPath)
fun ipv6_cidr_blockRef(subPath: String = "") = ref(this, "ipv6_cidr_block", subPath)
fun default_for_azRef(subPath: String = "") = ref(this, "default_for_az", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun availability_zone_idRef(subPath: String = "") = ref(this, "availability_zone_id", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun cidr_blockRef(subPath: String = "") = ref(this, "cidr_block", subPath)
fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun ipv6_cidr_block_association_idRef(subPath: String = "") = ref(this, "ipv6_cidr_block_association_id", subPath)
fun arnRef(subPath: String = "") = ref(this, "arn", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
}
