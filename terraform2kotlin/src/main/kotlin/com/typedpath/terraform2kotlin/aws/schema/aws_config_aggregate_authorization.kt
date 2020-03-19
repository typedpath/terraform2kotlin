package com.typedpath.terraform2kotlin.aws.schema

class aws_config_aggregate_authorization(val region : String, val account_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 

}
