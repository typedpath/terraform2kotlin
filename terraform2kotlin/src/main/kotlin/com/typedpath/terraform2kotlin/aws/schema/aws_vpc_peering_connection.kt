package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_peering_connection(val vpc_id : String, val peer_vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var peer_region: String? = null
  var accepter: List<Accepter>? = null
  var requester: List<Requester>? = null
  var peer_owner_id: String? = null
  var auto_accept: Boolean? = null
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
}
