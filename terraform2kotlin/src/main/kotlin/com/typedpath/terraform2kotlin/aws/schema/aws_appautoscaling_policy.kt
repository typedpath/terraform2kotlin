package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_appautoscaling_policy(val name : String, val scalable_dimension : String, val resource_id : String, val service_namespace : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var adjustment_type: String? = null
  var metric_aggregation_type: String? = null
  var step_adjustment: List<Step_adjustment>? = null
  var target_tracking_scaling_policy_configuration: List<Target_tracking_scaling_policy_configuration>? = null
  var policy_type: String? = null
  var step_scaling_policy_configuration: List<Step_scaling_policy_configuration>? = null
  var cooldown: Int? = null
  var min_adjustment_magnitude: Int? = null
 


class Step_adjustment(val scaling_adjustment : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var metric_interval_upper_bound: String? = null
  var metric_interval_lower_bound: String? = null
 

}

class Target_tracking_scaling_policy_configuration(val target_value : Float) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var scale_in_cooldown: Int? = null
  var scale_out_cooldown: Int? = null
  var customized_metric_specification: List<Customized_metric_specification>? = null
  var predefined_metric_specification: List<Predefined_metric_specification>? = null
  var disable_scale_in: Boolean? = null
 


class Customized_metric_specification(val metric_name : String, val namespace : String, val statistic : Statistic) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var unit: String? = null
  var dimensions: List<Dimensions>? = null
 

enum class Statistic(val theValue: String ) {
	 Average ("Average"), Minimum ("Minimum"), Maximum ("Maximum"), SampleCount ("SampleCount"), Sum ("Sum") ;
	override fun toString() = theValue
	}

class Dimensions(val name : String, val value : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}

class Predefined_metric_specification(val predefined_metric_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var resource_label: String? = null
 

}
}

class Step_scaling_policy_configuration() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var adjustment_type: String? = null
  var cooldown: Int? = null
  var metric_aggregation_type: String? = null
  var min_adjustment_magnitude: Int? = null
  var step_adjustment: List<Step_adjustment>? = null
 


class Step_adjustment(val scaling_adjustment : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var metric_interval_lower_bound: String? = null
  var metric_interval_upper_bound: String? = null
 

}
}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
