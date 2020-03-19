package com.typedpath.terraform2kotlin.aws.schema

class aws_directory_service_directory(val password : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var alias: String? = null
  var enable_sso: Boolean? = null
  var type: Type? = null
  var description: String? = null
  var short_name: String? = null
  var connect_settings: List<Connect_settings>? = null
  var tags: Map<String, String>? = null
  var vpc_settings: List<Vpc_settings>? = null
  var edition: Edition? = null
  var size: Size? = null
 

enum class Edition(val theValue: String ) {
	 Enterprise ("Enterprise"), Standard ("Standard") ;
	override fun toString() = theValue
	}
enum class Size(val theValue: String ) {
	 Large ("Large"), Small ("Small") ;
	override fun toString() = theValue
	}
enum class Type(val theValue: String ) {
	 ADConnector ("ADConnector"), MicrosoftAD ("MicrosoftAD"), SimpleAD ("SimpleAD") ;
	override fun toString() = theValue
	}

class Vpc_settings(val subnet_ids : List<String>, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Connect_settings(val customer_username : String, val customer_dns_ips : List<String>, val subnet_ids : List<String>, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
