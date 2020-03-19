package com.typedpath.terraform2kotlin.aws.schema

class aws_ec2_traffic_mirror_filter_rule(val destination_cidr_block : String, val rule_number : Int, val source_cidr_block : String, val traffic_direction : Traffic_direction, val traffic_mirror_filter_id : String, val rule_action : Rule_action) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var destination_port_range: List<Destination_port_range>? = null
  var protocol: Int? = null
  var source_port_range: List<Source_port_range>? = null
  var description: String? = null
 

enum class Traffic_direction(val theValue: String ) {
	 ingress ("ingress"), egress ("egress") ;
	override fun toString() = theValue
	}
enum class Rule_action(val theValue: String ) {
	 accept ("accept"), reject ("reject") ;
	override fun toString() = theValue
	}

class Destination_port_range() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var from_port: Int? = null
  var to_port: Int? = null
 

}

class Source_port_range() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var to_port: Int? = null
  var from_port: Int? = null
 

}
}
