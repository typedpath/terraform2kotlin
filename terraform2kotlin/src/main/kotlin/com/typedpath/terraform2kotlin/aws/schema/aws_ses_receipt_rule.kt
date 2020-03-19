package com.typedpath.terraform2kotlin.aws.schema

class aws_ses_receipt_rule(val name : String, val rule_set_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var stop_action: List<Stop_action>? = null
  var recipients: List<String>? = null
  var add_header_action: List<Add_header_action>? = null
  var sns_action: List<Sns_action>? = null
  var workmail_action: List<Workmail_action>? = null
  var after: String? = null
  var tls_policy: String? = null
  var enabled: Boolean? = null
  var scan_enabled: Boolean? = null
  var s3_action: List<S3_action>? = null
  var bounce_action: List<Bounce_action>? = null
  var lambda_action: List<Lambda_action>? = null
 


class Workmail_action(val organization_arn : String, val position : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var topic_arn: String? = null
 

}

class S3_action(val bucket_name : String, val position : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var object_key_prefix: String? = null
  var topic_arn: String? = null
  var kms_key_arn: String? = null
 

}

class Bounce_action(val position : Int, val message : String, val sender : String, val smtp_reply_code : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var status_code: String? = null
  var topic_arn: String? = null
 

}

class Lambda_action(val function_arn : String, val position : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var invocation_type: String? = null
  var topic_arn: String? = null
 

}

class Stop_action(val scope : String, val position : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	  var topic_arn: String? = null
 

}

class Add_header_action(val header_name : String, val header_value : String, val position : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}

class Sns_action(val topic_arn : String, val position : Int) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="subresource"
	 

}
}
