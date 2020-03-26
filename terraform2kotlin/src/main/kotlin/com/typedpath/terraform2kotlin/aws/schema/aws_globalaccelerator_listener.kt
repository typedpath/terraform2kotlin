package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_globalaccelerator_listener(val accelerator_arn : String, val protocol : Protocol, val port_range : List<Port_range>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var client_affinity: Client_affinity? = null
 

enum class Protocol(val theValue: String ) {
	 TCP ("TCP"), UDP ("UDP") ;
	override fun toString() = theValue
	}
enum class Client_affinity(val theValue: String ) {
	 NONE ("NONE"), SOURCE_IP ("SOURCE_IP") ;
	override fun toString() = theValue
	}

class Port_range() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var from_port: Int? = null
  var to_port: Int? = null
 

}
}
