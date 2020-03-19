package com.typedpath.terraform2kotlin.aws.schema

class aws_emr_instance_group(val instance_type : String, val cluster_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var autoscaling_policy: String? = null
  var bid_price: String? = null
  var configurations_json: String? = null
  var instance_count: Int? = null
  var name: String? = null
  var ebs_optimized: Boolean? = null
  var ebs_config: List<Ebs_config>? = null
 


class Ebs_config(val size : Int, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var volumes_per_instance: Int? = null
  var iops: Int? = null
 

enum class Type(val theValue: String ) {
	 gp2 ("gp2"), io1 ("io1"), standard ("standard"), st1 ("st1") ;
	override fun toString() = theValue
	}
}
}
