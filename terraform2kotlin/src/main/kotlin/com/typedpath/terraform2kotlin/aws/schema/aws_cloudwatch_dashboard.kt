package com.typedpath.terraform2kotlin.aws.schema

class aws_cloudwatch_dashboard(val dashboard_body : String, val dashboard_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
