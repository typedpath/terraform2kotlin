package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appmesh_virtual_router(val name : String, val mesh_name : String, val spec : List<Spec>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Spec(val listener : List<Listener>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var service_names: List<String>? = null
 


class Listener(val port_mapping : List<Port_mapping>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 


class Port_mapping(val port : Int, val protocol : Protocol) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Protocol(val theValue: String ) {
	 http ("http"), tcp ("tcp") ;
	override fun toString() = theValue
	}
}
}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
