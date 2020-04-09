package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_load_balancer_policy(val load_balancer_name : String, val policy_name : String, val policy_type_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var policy_attribute: List<Policy_attribute>? = null
 


class Policy_attribute() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var name: String? = null
  var value: String? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
