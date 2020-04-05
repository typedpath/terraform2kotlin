package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_worklink_fleet(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var identity_provider: List<Identity_provider>? = null
  var optimize_for_end_user_location: Boolean? = null
  var audit_stream_arn: String? = null
  var network: List<Network>? = null
  var display_name: String? = null
  var device_ca_certificate: String? = null
 


class Identity_provider(val type : String, val saml_metadata : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Network(val security_group_ids : List<String>, val subnet_ids : List<String>, val vpc_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
