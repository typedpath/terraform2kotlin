package com.typedpath.terraform2kotlin.aws.schema

class aws_organizations_organizational_unit(val name : String, val parent_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
