package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ecs_task_definition(val family : String, val container_definitions : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var cpu: String? = null
  var memory: String? = null
  var requires_compatibilities: List<String>? = null
  var proxy_configuration: List<Proxy_configuration>? = null
  var volume: List<Volume>? = null
  var ipc_mode: Ipc_mode? = null
  var pid_mode: Pid_mode? = null
  var placement_constraints: List<Placement_constraints>? = null
  var tags: Map<String, String>? = null
  var task_role_arn: String? = null
  var execution_role_arn: String? = null
  var network_mode: Network_mode? = null
 

enum class Ipc_mode(val theValue: String ) {
	 host ("host"), none ("none"), task ("task") ;
	override fun toString() = theValue
	}
enum class Pid_mode(val theValue: String ) {
	 host ("host"), task ("task") ;
	override fun toString() = theValue
	}
enum class Network_mode(val theValue: String ) {
	 bridge ("bridge"), host ("host"), awsvpc ("awsvpc"), none ("none") ;
	override fun toString() = theValue
	}

class Proxy_configuration(val container_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var properties: Map<String, String>? = null
  var type: Type? = null
 

enum class Type(val theValue: String ) {
	 APPMESH ("APPMESH") ;
	override fun toString() = theValue
	}
}

class Volume(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var host_path: String? = null
  var docker_volume_configuration: List<Docker_volume_configuration>? = null
  var efs_volume_configuration: List<Efs_volume_configuration>? = null
 


class Docker_volume_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var scope: Scope? = null
  var autoprovision: Boolean? = null
  var driver: String? = null
  var driver_opts: Map<String, String>? = null
  var labels: Map<String, String>? = null
 

enum class Scope(val theValue: String ) {
	 shared ("shared"), task ("task") ;
	override fun toString() = theValue
	}
}

class Efs_volume_configuration(val file_system_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var root_directory: String? = null
 

}
}

class Placement_constraints(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var expression: String? = null
 

enum class Type(val theValue: String ) {
	 memberOf ("memberOf") ;
	override fun toString() = theValue
	}
}
fun revisionRef(subPath: String = "") = ref(this, "revision", subPath)
fun statusRef(subPath: String = "") = ref(this, "status", subPath)
fun task_role_arnRef(subPath: String = "") = ref(this, "task_role_arn", subPath)
fun task_definitionRef(subPath: String = "") = ref(this, "task_definition", subPath)
fun familyRef(subPath: String = "") = ref(this, "family", subPath)
fun network_modeRef(subPath: String = "") = ref(this, "network_mode", subPath)
}
