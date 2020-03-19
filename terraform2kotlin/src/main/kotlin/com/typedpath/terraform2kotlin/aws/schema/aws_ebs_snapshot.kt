package com.typedpath.terraform2kotlin.aws.schema

class aws_ebs_snapshot(val volume_id : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var description: String? = null
 

}
