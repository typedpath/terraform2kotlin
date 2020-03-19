package com.typedpath.terraform2kotlin.aws.schema

class aws_appmesh_virtual_node(val name : String, val mesh_name : String, val spec : List<Spec>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
 


class Spec() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var listener: List<Listener>? = null
  var logging: List<Logging>? = null
  var service_discovery: List<Service_discovery>? = null
  var backends: List<String>? = null
  var backend: List<Backend>? = null
 


class Logging() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var access_log: List<Access_log>? = null
 


class Access_log() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var file: List<File>? = null
 


class File(val path : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}

class Service_discovery() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var aws_cloud_map: List<Aws_cloud_map>? = null
  var dns: List<Dns>? = null
 


class Aws_cloud_map(val service_name : String, val namespace_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var attributes: Map<String, String>? = null
 

}

class Dns(val hostname : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var service_name: String? = null
 

}
}

class Backend() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var virtual_service: List<Virtual_service>? = null
 


class Virtual_service(val virtual_service_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Listener(val port_mapping : List<Port_mapping>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var health_check: List<Health_check>? = null
 


class Port_mapping(val port : Int, val protocol : Protocol) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Protocol(val theValue: String ) {
	 http ("http"), tcp ("tcp") ;
	override fun toString() = theValue
	}
}

class Health_check(val protocol : Protocol, val timeout_millis : Int, val unhealthy_threshold : Int, val healthy_threshold : Int, val interval_millis : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var path: String? = null
  var port: Int? = null
 

enum class Protocol(val theValue: String ) {
	 http ("http"), tcp ("tcp") ;
	override fun toString() = theValue
	}
}
}
}
}
