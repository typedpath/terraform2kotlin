package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_cloudtrail(val name : String, val s3_bucket_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var is_multi_region_trail: Boolean? = null
  var tags: Map<String, String>? = null
  var cloud_watch_logs_role_arn: String? = null
  var cloud_watch_logs_group_arn: String? = null
  var include_global_service_events: Boolean? = null
  var is_organization_trail: Boolean? = null
  var event_selector: List<Event_selector>? = null
  var sns_topic_name: String? = null
  var enable_log_file_validation: Boolean? = null
  var enable_logging: Boolean? = null
  var s3_key_prefix: String? = null
  var kms_key_id: String? = null
 


class Event_selector() :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var read_write_type: Read_write_type? = null
  var include_management_events: Boolean? = null
  var data_resource: List<Data_resource>? = null
 

enum class Read_write_type(val theValue: String ) {
	 All ("All"), ReadOnly ("ReadOnly"), WriteOnly ("WriteOnly") ;
	override fun toString() = theValue
	}

class Data_resource(val type : Type, val values : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

enum class Type(val theValue: String ) {
	 AWS__S3__Object ("AWS::S3::Object"), AWS__Lambda__Function ("AWS::Lambda::Function") ;
	override fun toString() = theValue
	}
}
}
}
