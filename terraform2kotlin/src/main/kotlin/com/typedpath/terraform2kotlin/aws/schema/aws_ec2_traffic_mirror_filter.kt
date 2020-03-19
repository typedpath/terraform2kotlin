package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_traffic_mirror_filter() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
  var network_services: List<Network_services>? = null
 

enum class Network_services(val theValue: String ) {
	 amazon_dns ("amazon-dns") ;
	override fun toString() = theValue
	}
}
