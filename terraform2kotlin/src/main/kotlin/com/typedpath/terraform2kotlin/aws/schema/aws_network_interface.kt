package com.typedpath.terraform2kotlin.aws.schema

class aws_network_interface(val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var tags: Map<String, String>? = null
  var private_ips: List<String>? = null
  var private_ips_count: Int? = null
  var security_groups: List<String>? = null
  var source_dest_check: Boolean? = null
  var attachment: List<Attachment>? = null
  var private_ip: String? = null
 


class Attachment(val instance : String, val device_index : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
