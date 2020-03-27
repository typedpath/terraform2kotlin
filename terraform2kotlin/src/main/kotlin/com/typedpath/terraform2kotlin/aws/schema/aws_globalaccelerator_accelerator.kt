package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_globalaccelerator_accelerator(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var attributes: List<Attributes>? = null
  var tags: Map<String, String>? = null
  var ip_address_type: Ip_address_type? = null
 

enum class Ip_address_type(val theValue: String ) {
	 IPV4 ("IPV4") ;
	override fun toString() = theValue
	}

class Attributes() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var flow_logs_enabled: Boolean? = null
  var flow_logs_s3_bucket: String? = null
  var flow_logs_s3_prefix: String? = null
 

}
}
