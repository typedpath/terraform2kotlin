package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_log_metric_filter(val log_group_name : String, val metric_transformation : List<Metric_transformation>, val name : String, val pattern : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	 


class Metric_transformation(val name : String, val namespace : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var default_value: String? = null
 

}
}
