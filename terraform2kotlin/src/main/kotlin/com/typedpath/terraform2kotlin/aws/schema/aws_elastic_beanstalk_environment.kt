package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_elastic_beanstalk_environment(val name : String, val application : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var setting: List<Setting>? = null
  var version_label: String? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var template_name: String? = null
  var platform_arn: String? = null
  var wait_for_ready_timeout: String? = null
  var cname_prefix: String? = null
  var tier: String? = null
  var solution_stack_name: String? = null
  var poll_interval: String? = null
 


class Setting(val namespace : String, val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
