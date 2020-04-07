package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_redshift_snapshot_schedule(val definitions : List<String>) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var force_destroy: Boolean? = null
  var tags: Map<String, String>? = null
  var identifier: String? = null
  var identifier_prefix: String? = null
  var description: String? = null
 

}
