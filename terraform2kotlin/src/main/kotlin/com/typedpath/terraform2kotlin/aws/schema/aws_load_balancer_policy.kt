package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_load_balancer_policy(val policy_type_name : String, val load_balancer_name : String, val policy_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var policy_attribute: List<Policy_attribute>? = null
 


class Policy_attribute() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var value: String? = null
  var name: String? = null
 

}
}
