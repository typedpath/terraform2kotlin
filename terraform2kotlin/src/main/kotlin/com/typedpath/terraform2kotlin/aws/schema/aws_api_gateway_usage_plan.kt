package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_api_gateway_usage_plan(val name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var product_code: String? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var api_stages: List<Api_stages>? = null
  var quota_settings: List<Quota_settings>? = null
  var throttle_settings: List<Throttle_settings>? = null
 


class Api_stages(val api_id : String, val stage : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Quota_settings(val period : Period, val limit : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var offset: Int? = null
 

enum class Period(val theValue: String ) {
	 DAY ("DAY"), WEEK ("WEEK"), MONTH ("MONTH") ;
	override fun toString() = theValue
	}
}

class Throttle_settings() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var burst_limit: Int? = null
  var rate_limit: Float? = null
 

}
	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
