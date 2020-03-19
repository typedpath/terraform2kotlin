package com.typedpath.terraform2kotlin.aws.schema

class aws_dx_connection_association(val connection_id : String, val lag_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
