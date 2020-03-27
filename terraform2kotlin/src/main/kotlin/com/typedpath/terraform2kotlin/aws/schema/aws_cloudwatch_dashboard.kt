package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_dashboard(val dashboard_name : String, val dashboard_body : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
