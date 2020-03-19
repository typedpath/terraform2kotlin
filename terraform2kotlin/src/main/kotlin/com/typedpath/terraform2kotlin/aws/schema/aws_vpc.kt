package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc(val cidr_block : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var instance_tenancy: Instance_tenancy? = null
  var enable_classiclink: Boolean? = null
  var enable_classiclink_dns_support: Boolean? = null
  var assign_generated_ipv6_cidr_block: Boolean? = null
  var enable_dns_hostnames: Boolean? = null
  var enable_dns_support: Boolean? = null
  var tags: Map<String, String>? = null
 

enum class Instance_tenancy(val theValue: String ) {
	 default ("default"), dedicated ("dedicated") ;
	override fun toString() = theValue
	}
}
