package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_wafregional_rule_group(val name : String, val metric_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var activated_rule: List<Activated_rule>? = null
  var tags: Map<String, String>? = null
 


class Activated_rule(val rule_id : String, val action : List<Action>, val priority : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var type: String? = null
 


class Action(val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
