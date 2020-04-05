package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_opsworks_application(val type : Type, val name : String, val stack_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var document_root: String? = null
  var data_source_type: String? = null
  var domains: List<String>? = null
  var environment: List<Environment>? = null
  var ssl_configuration: List<Ssl_configuration>? = null
  var rails_env: String? = null
  var auto_bundle_on_deploy: String? = null
  var app_source: List<App_source>? = null
  var data_source_database_name: String? = null
  var data_source_arn: String? = null
  var description: String? = null
  var enable_ssl: Boolean? = null
  var aws_flow_ruby_settings: String? = null
  var short_name: String? = null
 

enum class Type(val theValue: String ) {
	 aws_flow_ruby ("aws-flow-ruby"), java ("java"), rails ("rails"), php ("php"), nodejs ("nodejs"), static ("static"), other ("other") ;
	override fun toString() = theValue
	}

class App_source(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var url: String? = null
  var username: String? = null
  var password: String? = null
  var revision: String? = null
  var ssh_key: String? = null
 

}

class Environment(val key : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var secure: Boolean? = null
 

}

class Ssl_configuration(val certificate : String, val private_key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var chain: String? = null
 

}
}
