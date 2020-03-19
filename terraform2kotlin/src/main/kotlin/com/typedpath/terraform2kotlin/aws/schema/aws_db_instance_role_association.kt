package com.typedpath.terraform2kotlin.aws.schema

class aws_db_instance_role_association(val role_arn : String, val db_instance_identifier : String, val feature_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
