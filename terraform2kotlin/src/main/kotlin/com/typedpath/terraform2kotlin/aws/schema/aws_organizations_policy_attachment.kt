package com.typedpath.terraform2kotlin.aws.schema

class aws_organizations_policy_attachment(val policy_id : String, val target_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
