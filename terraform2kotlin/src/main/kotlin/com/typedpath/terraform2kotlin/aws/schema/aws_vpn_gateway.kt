package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpn_gateway() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var vpc_id: String? = null
  var tags: Map<String, String>? = null
  var availability_zone: String? = null
  var amazon_side_asn: String? = null
 

fun stateRef(subPath: String = "") = ref(this, "state", subPath)
fun attached_vpc_idRef(subPath: String = "") = ref(this, "attached_vpc_id", subPath)
fun availability_zoneRef(subPath: String = "") = ref(this, "availability_zone", subPath)
fun amazon_side_asnRef(subPath: String = "") = ref(this, "amazon_side_asn", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
