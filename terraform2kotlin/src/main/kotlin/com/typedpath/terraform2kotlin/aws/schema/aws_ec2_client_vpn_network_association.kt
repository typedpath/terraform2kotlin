package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_client_vpn_network_association(val client_vpn_endpoint_id : String, val subnet_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}