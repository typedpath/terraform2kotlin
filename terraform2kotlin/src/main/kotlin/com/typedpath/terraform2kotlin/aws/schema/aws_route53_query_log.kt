package com.typedpath.terraform2kotlin.aws.schema

class aws_route53_query_log(val zone_id : String, val cloudwatch_log_group_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
