package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_emr_instance_group(val cluster_id : String, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var bid_price: String? = null
  var ebs_optimized: Boolean? = null
  var ebs_config: List<Ebs_config>? = null
  var name: String? = null
  var autoscaling_policy: String? = null
  var configurations_json: String? = null
  var instance_count: Int? = null
 


class Ebs_config(val size : Int, val type : Type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var iops: Int? = null
  var volumes_per_instance: Int? = null
 

enum class Type(val theValue: String ) {
	 gp2 ("gp2"), io1 ("io1"), standard ("standard"), st1 ("st1") ;
	override fun toString() = theValue
	}
}
}
