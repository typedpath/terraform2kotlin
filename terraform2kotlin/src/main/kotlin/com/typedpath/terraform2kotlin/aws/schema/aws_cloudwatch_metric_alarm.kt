package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudwatch_metric_alarm(val evaluation_periods : Int, val alarm_name : String, val comparison_operator : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var period: Int? = null
  var statistic: String? = null
  var dimensions: Map<String, String>? = null
  var evaluate_low_sample_count_percentiles: Evaluate_low_sample_count_percentiles? = null
  var namespace: String? = null
  var threshold: Float? = null
  var alarm_description: String? = null
  var ok_actions: List<String>? = null
  var extended_statistic: String? = null
  var tags: Map<String, String>? = null
  var metric_query: List<Metric_query>? = null
  var alarm_actions: List<String>? = null
  var datapoints_to_alarm: Int? = null
  var insufficient_data_actions: List<String>? = null
  var unit: String? = null
  var treat_missing_data: Treat_missing_data? = null
  var metric_name: String? = null
  var threshold_metric_id: String? = null
  var actions_enabled: Boolean? = null
 

enum class Evaluate_low_sample_count_percentiles(val theValue: String ) {
	 evaluate ("evaluate"), ignore ("ignore") ;
	override fun toString() = theValue
	}
enum class Treat_missing_data(val theValue: String ) {
	 breaching ("breaching"), notBreaching ("notBreaching"), ignore ("ignore"), missing ("missing") ;
	override fun toString() = theValue
	}

class Metric_query(val id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var expression: String? = null
  var metric: List<Metric>? = null
  var label: String? = null
  var return_data: Boolean? = null
 


class Metric(val metric_name : String, val period : Int, val stat : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var unit: String? = null
  var dimensions: Map<String, String>? = null
  var namespace: String? = null
 

}
}
}
