package com.typedpath.terraform2kotlin.aws.schema

class aws_elasticsearch_domain_policy(val domain_name : String, val access_policies : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
