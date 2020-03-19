package com.typedpath.terraform2kotlin.aws.schema

class aws_redshift_snapshot_schedule(val definitions : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var description: String? = null
  var force_destroy: Boolean? = null
  var tags: Map<String, String>? = null
  var identifier: String? = null
  var identifier_prefix: String? = null
 

}
