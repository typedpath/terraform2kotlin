package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_traffic_mirror_session(val network_interface_id : String, val session_number : Int, val traffic_mirror_filter_id : String, val traffic_mirror_target_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var virtual_network_id: Int? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var packet_length: Int? = null
 

}