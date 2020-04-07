package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_traffic_mirror_target() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var network_load_balancer_arn: String? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var network_interface_id: String? = null
 

}
