package com.typedpath.terraform2kotlin.aws.schema

class aws_cognito_resource_server(val user_pool_id : String, val identifier : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var scope: List<Scope>? = null
 


class Scope(val scope_description : String, val scope_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
