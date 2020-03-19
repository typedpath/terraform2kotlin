package com.typedpath.terraform2kotlin.aws.schema

class aws_db_option_group(val engine_name : String, val major_engine_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var option: List<Option>? = null
  var tags: Map<String, String>? = null
  var name: String? = null
  var name_prefix: String? = null
  var option_group_description: String? = null
 


class Option(val option_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var option_settings: List<Option_settings>? = null
  var port: Int? = null
  var db_security_group_memberships: List<String>? = null
  var vpc_security_group_memberships: List<String>? = null
  var version: String? = null
 


class Option_settings(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
