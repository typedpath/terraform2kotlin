package com.typedpath.terraform2kotlin.aws.schema

class aws_iam_openid_connect_provider(val url : String, val client_id_list : List<String>, val thumbprint_list : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 

}
