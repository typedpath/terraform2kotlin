package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_provisioned_concurrency_config(val qualifier : String, val function_name : String, val provisioned_concurrent_executions : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
