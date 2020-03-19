package com.typedpath.terraform2kotlin.aws.schema

class aws_dynamodb_global_table(val name : String, val replica : List<Replica>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Replica(val region_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
