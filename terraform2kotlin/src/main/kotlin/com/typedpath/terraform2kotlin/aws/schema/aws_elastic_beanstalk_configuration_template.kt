package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastic_beanstalk_configuration_template(val name : String, val application : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var environment_id: String? = null
  var setting: List<Setting>? = null
  var solution_stack_name: String? = null
 


class Setting(val namespace : String, val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
