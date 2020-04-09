package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_db_option_group(val engine_name : String, val major_engine_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var name: String? = null
  var name_prefix: String? = null
  var option_group_description: String? = null
  var option: List<Option>? = null
 


class Option(val option_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var version: String? = null
  var option_settings: List<Option_settings>? = null
  var port: Int? = null
  var db_security_group_memberships: List<String>? = null
  var vpc_security_group_memberships: List<String>? = null
 


class Option_settings(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
