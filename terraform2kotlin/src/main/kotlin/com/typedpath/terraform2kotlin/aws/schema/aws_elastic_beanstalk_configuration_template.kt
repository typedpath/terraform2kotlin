package com.typedpath.terraform2kotlin.aws.schema

class aws_elastic_beanstalk_configuration_template(val application : String, val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var solution_stack_name: String? = null
  var description: String? = null
  var environment_id: String? = null
  var setting: List<Setting>? = null
 


class Setting(val namespace : String, val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource: String? = null
 

}
}
