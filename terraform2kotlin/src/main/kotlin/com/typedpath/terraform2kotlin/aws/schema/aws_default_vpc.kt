package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_default_vpc() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var enable_classiclink_dns_support: Boolean? = null
  var enable_dns_hostnames: Boolean? = null
  var enable_dns_support: Boolean? = null
  var enable_classiclink: Boolean? = null
 

}
