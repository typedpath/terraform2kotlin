package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_autoscaling_policy(val name : String, val autoscaling_group_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var adjustment_type: String? = null
  var cooldown: Int? = null
  var estimated_instance_warmup: Int? = null
  var metric_aggregation_type: String? = null
  var min_adjustment_step: Int? = null
  var scaling_adjustment: Int? = null
  var step_adjustment: List<Step_adjustment>? = null
  var target_tracking_configuration: List<Target_tracking_configuration>? = null
  var policy_type: Policy_type? = null
  var min_adjustment_magnitude: Int? = null
 

enum class Policy_type(val theValue: String ) {
	 SimpleScaling ("SimpleScaling"), StepScaling ("StepScaling"), TargetTrackingScaling ("TargetTrackingScaling") ;
	override fun toString() = theValue
	}

class Step_adjustment(val scaling_adjustment : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var metric_interval_lower_bound: String? = null
  var metric_interval_upper_bound: String? = null
 

}

class Target_tracking_configuration(val target_value : Float) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var predefined_metric_specification: List<Predefined_metric_specification>? = null
  var customized_metric_specification: List<Customized_metric_specification>? = null
  var disable_scale_in: Boolean? = null
 


class Predefined_metric_specification(val predefined_metric_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource_label: String? = null
 

}

class Customized_metric_specification(val metric_name : String, val namespace : String, val statistic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var metric_dimension: List<Metric_dimension>? = null
  var unit: String? = null
 


class Metric_dimension(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
}
