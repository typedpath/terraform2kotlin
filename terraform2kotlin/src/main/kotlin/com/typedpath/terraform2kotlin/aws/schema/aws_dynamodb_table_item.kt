package com.typedpath.terraform2kotlin.aws.schema

class aws_dynamodb_table_item(val table_name : String, val hash_key : String, val item : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var range_key: String? = null
 

}