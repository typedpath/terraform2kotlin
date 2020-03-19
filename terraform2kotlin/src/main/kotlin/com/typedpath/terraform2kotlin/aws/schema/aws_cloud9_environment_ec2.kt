package com.typedpath.terraform2kotlin.aws.schema

class aws_cloud9_environment_ec2(val name : String, val instance_type : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var subnet_id: String? = null
  var automatic_stop_time_minutes: Int? = null
  var description: String? = null
  var owner_arn: String? = null
  var tags: Map<String, String>? = null
 

}