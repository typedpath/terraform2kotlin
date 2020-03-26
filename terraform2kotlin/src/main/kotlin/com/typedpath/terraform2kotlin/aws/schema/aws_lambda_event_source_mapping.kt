package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_lambda_event_source_mapping(val event_source_arn : String, val function_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var maximum_batching_window_in_seconds: Int? = null
  var maximum_record_age_in_seconds: Int? = null
  var starting_position_timestamp: String? = null
  var batch_size: Int? = null
  var parallelization_factor: Int? = null
  var bisect_batch_on_function_error: Boolean? = null
  var destination_config: List<Destination_config>? = null
  var starting_position: Starting_position? = null
  var enabled: Boolean? = null
  var maximum_retry_attempts: Int? = null
 

enum class Starting_position(val theValue: String ) {
	 AT_TIMESTAMP ("AT_TIMESTAMP"), LATEST ("LATEST"), TRIM_HORIZON ("TRIM_HORIZON") ;
	override fun toString() = theValue
	}

class Destination_config() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var on_failure: List<On_failure>? = null
 


class On_failure(val destination_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
}
