package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ec2_client_vpn_endpoint(val server_certificate_arn : String, val authentication_options : List<Authentication_options>, val connection_log_options : List<Connection_log_options>, val client_cidr_block : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var dns_servers: List<String>? = null
  var transport_protocol: Transport_protocol? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var split_tunnel: Boolean? = null
 

enum class Transport_protocol(val theValue: String ) {
	 tcp ("tcp"), udp ("udp") ;
	override fun toString() = theValue
	}

class Authentication_options(val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var active_directory_id: String? = null
  var root_certificate_chain_arn: String? = null
 

enum class Type(val theValue: String ) {
	 certificate_authentication ("certificate-authentication"), directory_service_authentication ("directory-service-authentication") ;
	override fun toString() = theValue
	}
}

class Connection_log_options(val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var cloudwatch_log_group: String? = null
  var cloudwatch_log_stream: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
