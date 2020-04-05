package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ses_event_destination(val matching_types : List<Matching_types>, val name : String, val configuration_set_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var enabled: Boolean? = null
  var cloudwatch_destination: List<Cloudwatch_destination>? = null
  var kinesis_destination: List<Kinesis_destination>? = null
  var sns_destination: List<Sns_destination>? = null
 

enum class Matching_types(val theValue: String ) {
	 send ("send"), reject ("reject"), bounce ("bounce"), complaint ("complaint"), delivery ("delivery"), _open ("open"), click ("click"), renderingFailure ("renderingFailure") ;
	override fun toString() = theValue
	}

class Cloudwatch_destination(val default_value : String, val dimension_name : String, val value_source : Value_source) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Value_source(val theValue: String ) {
	 messageTag ("messageTag"), emailHeader ("emailHeader"), linkTag ("linkTag") ;
	override fun toString() = theValue
	}
}

class Kinesis_destination(val role_arn : String, val stream_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Sns_destination(val topic_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
