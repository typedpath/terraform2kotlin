package com.typedpath.terraform2kotlin.aws.schema

class aws_waf_rule_group(val name : String, val metric_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var activated_rule: List<Activated_rule>? = null
  var tags: Map<String, String>? = null
 


class Activated_rule(val action : List<Action>, val priority : Int, val rule_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: String? = null
 


class Action(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
