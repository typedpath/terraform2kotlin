package com.typedpath.terraform2kotlin.aws.schema

class aws_budgets_budget(val budget_type : String, val limit_unit : String, val time_unit : String, val limit_amount : String, val time_period_start : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var name_prefix: String? = null
  var time_period_end: String? = null
  var cost_filters: Map<String, String>? = null
  var notification: List<Notification>? = null
  var account_id: String? = null
  var cost_types: List<Cost_types>? = null
  var name: String? = null
 


class Cost_types() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var include_upfront: Boolean? = null
  var use_blended: Boolean? = null
  var include_credit: Boolean? = null
  var include_recurring: Boolean? = null
  var include_refund: Boolean? = null
  var include_support: Boolean? = null
  var use_amortized: Boolean? = null
  var include_discount: Boolean? = null
  var include_other_subscription: Boolean? = null
  var include_subscription: Boolean? = null
  var include_tax: Boolean? = null
 

}

class Notification(val comparison_operator : Comparison_operator, val threshold : Float, val threshold_type : Threshold_type, val notification_type : Notification_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var subscriber_email_addresses: List<String>? = null
  var subscriber_sns_topic_arns: List<String>? = null
 

enum class Comparison_operator(val theValue: String ) {
	 EQUAL_TO ("EQUAL_TO"), GREATER_THAN ("GREATER_THAN"), LESS_THAN ("LESS_THAN") ;
	override fun toString() = theValue
	}
enum class Threshold_type(val theValue: String ) {
	 ABSOLUTE_VALUE ("ABSOLUTE_VALUE"), PERCENTAGE ("PERCENTAGE") ;
	override fun toString() = theValue
	}
enum class Notification_type(val theValue: String ) {
	 ACTUAL ("ACTUAL"), FORECASTED ("FORECASTED") ;
	override fun toString() = theValue
	}
}
}
