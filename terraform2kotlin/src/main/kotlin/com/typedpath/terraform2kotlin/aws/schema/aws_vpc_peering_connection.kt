package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_vpc_peering_connection(val peer_vpc_id : String, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var requester: List<Requester>? = null
  var peer_owner_id: String? = null
  var accepter: List<Accepter>? = null
  var auto_accept: Boolean? = null
  var peer_region: String? = null
  var tags: Map<String, String>? = null
 


class Requester() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var allow_remote_vpc_dns_resolution: Boolean? = null
  var allow_classic_link_to_remote_vpc: Boolean? = null
  var allow_vpc_to_remote_classic_link: Boolean? = null
 

}

class Accepter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var allow_remote_vpc_dns_resolution: Boolean? = null
  var allow_classic_link_to_remote_vpc: Boolean? = null
  var allow_vpc_to_remote_classic_link: Boolean? = null
 

}
fun tagsRef(subPath: String = "") = ref(this, "tags", subPath)
fun idRef(subPath: String = "") = ref(this, "id", subPath)
fun owner_idRef(subPath: String = "") = ref(this, "owner_id", subPath)
fun peer_cidr_blockRef(subPath: String = "") = ref(this, "peer_cidr_block", subPath)
fun filterRef(subPath: String = "") = ref(this, "filter", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun regionRef(subPath: String = "") = ref(this, "region", subPath)
fun accepterRef(subPath: String = "") = ref(this, "accepter", subPath)
fun peer_owner_idRef(subPath: String = "") = ref(this, "peer_owner_id", subPath)
fun peer_regionRef(subPath: String = "") = ref(this, "peer_region", subPath)
fun requesterRef(subPath: String = "") = ref(this, "requester", subPath)
fun vpc_idRef(subPath: String = "") = ref(this, "vpc_id", subPath)
fun cidr_blockRef(subPath: String = "") = ref(this, "cidr_block", subPath)
fun peer_vpc_idRef(subPath: String = "") = ref(this, "peer_vpc_id", subPath)
}
