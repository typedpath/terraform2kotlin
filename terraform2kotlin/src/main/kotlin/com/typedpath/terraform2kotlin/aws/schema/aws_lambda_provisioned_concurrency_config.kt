package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_provisioned_concurrency_config(val function_name : String, val provisioned_concurrent_executions : Int, val qualifier : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
