package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_peering_connection_accepter(val vpc_peering_connection_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var auto_accept: Boolean? = null
  var requester: List<Requester>? = null
  var tags: Map<String, String>? = null
  var accepter: List<Accepter>? = null
 


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