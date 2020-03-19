package com.typedpath.terraform2kotlin.aws.schema

class aws_vpc_ipv4_cidr_block_association(val cidr_block : String, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
