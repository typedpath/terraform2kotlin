package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_topic_rule(val name : String, val sql : String, val enabled : Boolean, val sql_version : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var dynamodb: List<Dynamodb>? = null
  var firehose: List<Firehose>? = null
  var cloudwatch_metric: List<Cloudwatch_metric>? = null
  var kinesis: List<Kinesis>? = null
  var lambda: List<Lambda>? = null
  var s3: List<S3>? = null
  var sns: List<Sns>? = null
  var cloudwatch_alarm: List<Cloudwatch_alarm>? = null
  var elasticsearch: List<Elasticsearch>? = null
  var republish: List<Republish>? = null
  var sqs: List<Sqs>? = null
  var description: String? = null
 


class S3(val bucket_name : String, val key : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Elasticsearch(val endpoint : String, val id : String, val index : String, val role_arn : String, val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Kinesis(val role_arn : String, val stream_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var partition_key: String? = null
 

}

class Lambda(val function_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Cloudwatch_metric(val metric_unit : String, val metric_value : String, val role_arn : String, val metric_name : String, val metric_namespace : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var metric_timestamp: String? = null
 

}

class Sns(val target_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var message_format: String? = null
 

}

class Cloudwatch_alarm(val state_reason : String, val state_value : String, val alarm_name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Republish(val role_arn : String, val topic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Sqs(val queue_url : String, val role_arn : String, val use_base64 : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Dynamodb(val hash_key_value : String, val role_arn : String, val table_name : String, val hash_key_field : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var hash_key_type: String? = null
  var payload_field: String? = null
  var range_key_value: String? = null
  var range_key_field: String? = null
  var range_key_type: String? = null
 

}

class Firehose(val delivery_stream_name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var separator: String? = null
 

}
}
