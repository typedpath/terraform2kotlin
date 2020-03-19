package com.typedpath.terraform2kotlin.aws.schema

class aws_opsworks_rds_db_instance(val stack_id : String, val rds_db_instance_arn : String, val db_password : String, val db_user : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
