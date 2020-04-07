package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_iot_topic_rule(val name : String, val sql : String, val sql_version : String, val enabled : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var firehose: List<Firehose>? = null
  var lambda: List<Lambda>? = null
  var cloudwatch_alarm: List<Cloudwatch_alarm>? = null
  var dynamodb: List<Dynamodb>? = null
  var description: String? = null
  var sns: List<Sns>? = null
  var republish: List<Republish>? = null
  var s3: List<S3>? = null
  var sqs: List<Sqs>? = null
  var cloudwatch_metric: List<Cloudwatch_metric>? = null
  var elasticsearch: List<Elasticsearch>? = null
  var kinesis: List<Kinesis>? = null
 


class Sns(val target_arn : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var message_format: String? = null
 

}

class Republish(val role_arn : String, val topic : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Cloudwatch_metric(val metric_name : String, val metric_namespace : String, val metric_unit : String, val metric_value : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var metric_timestamp: String? = null
 

}

class Kinesis(val role_arn : String, val stream_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var partition_key: String? = null
 

}

class Firehose(val role_arn : String, val delivery_stream_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var separator: String? = null
 

}

class Lambda(val function_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Cloudwatch_alarm(val state_reason : String, val state_value : String, val alarm_name : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Dynamodb(val table_name : String, val hash_key_field : String, val hash_key_value : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var hash_key_type: String? = null
  var payload_field: String? = null
  var range_key_type: String? = null
  var range_key_field: String? = null
  var range_key_value: String? = null
 

}

class S3(val bucket_name : String, val key : String, val role_arn : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Sqs(val queue_url : String, val role_arn : String, val use_base64 : Boolean) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Elasticsearch(val endpoint : String, val id : String, val index : String, val role_arn : String, val type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
