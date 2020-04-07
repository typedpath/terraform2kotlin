package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appmesh_virtual_service(val spec : List<Spec>, val name : String, val mesh_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Spec() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var provider: List<Provider>? = null
 


class Provider() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var virtual_node: List<Virtual_node>? = null
  var virtual_router: List<Virtual_router>? = null
 


class Virtual_node(val virtual_node_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Virtual_router(val virtual_router_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}
