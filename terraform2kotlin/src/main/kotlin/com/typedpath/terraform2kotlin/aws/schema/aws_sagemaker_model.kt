package com.typedpath.terraform2kotlin.aws.schema

class aws_sagemaker_model(val execution_role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var primary_container: List<Primary_container>? = null
  var vpc_config: List<Vpc_config>? = null
  var enable_network_isolation: Boolean? = null
  var container: List<Container>? = null
  var tags: Map<String, String>? = null
  var name: String? = null
 


class Primary_container(val image : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var container_hostname: String? = null
  var model_data_url: String? = null
  var environment: Map<String, String>? = null
 

}

class Vpc_config(val subnets : List<String>, val security_group_ids : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Container(val image : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var model_data_url: String? = null
  var environment: Map<String, String>? = null
  var container_hostname: String? = null
 

}
}
