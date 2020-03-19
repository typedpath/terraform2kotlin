package com.typedpath.terraform2kotlin.aws.schema

class aws_network_interface_attachment(val device_index : Int, val instance_id : String, val network_interface_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
