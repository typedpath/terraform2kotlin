package com.typedpath.terraform2kotlin.aws.schema

class aws_ecs_cluster(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var default_capacity_provider_strategy: List<Default_capacity_provider_strategy>? = null
  var setting: List<Setting>? = null
  var tags: Map<String, String>? = null
  var capacity_providers: List<String>? = null
 


class Default_capacity_provider_strategy(val capacity_provider : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var weight: Int? = null
  var base: Int? = null
 

}

class Setting(val name : Name, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Name(val theValue: String ) {
	 containerInsights ("containerInsights") ;
	override fun toString() = theValue
	}
}
}
