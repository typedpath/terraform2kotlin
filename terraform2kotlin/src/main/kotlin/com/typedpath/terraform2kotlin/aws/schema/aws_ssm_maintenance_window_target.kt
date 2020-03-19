package com.typedpath.terraform2kotlin.aws.schema

class aws_ssm_maintenance_window_target(val window_id : String, val resource_type : String, val targets : List<Targets>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var owner_information: String? = null
  var name: String? = null
  var description: String? = null
 


class Targets(val values : List<String>, val key : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
