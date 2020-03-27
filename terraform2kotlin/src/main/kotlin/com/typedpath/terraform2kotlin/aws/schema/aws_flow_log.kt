package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_flow_log(val traffic_type : Traffic_type) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var log_destination: String? = null
  var eni_id: String? = null
  var log_format: String? = null
  var iam_role_arn: String? = null
  var log_group_name: String? = null
  var vpc_id: String? = null
  var subnet_id: String? = null
  var tags: Map<String, String>? = null
  var log_destination_type: Log_destination_type? = null
 

enum class Traffic_type(val theValue: String ) {
	 ACCEPT ("ACCEPT"), ALL ("ALL"), REJECT ("REJECT") ;
	override fun toString() = theValue
	}
enum class Log_destination_type(val theValue: String ) {
	 cloud_watch_logs ("cloud-watch-logs"), s3 ("s3") ;
	override fun toString() = theValue
	}
}
