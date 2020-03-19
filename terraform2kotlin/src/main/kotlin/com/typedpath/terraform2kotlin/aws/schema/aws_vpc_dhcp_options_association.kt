package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_dhcp_options_association(val vpc_id : String, val dhcp_options_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
