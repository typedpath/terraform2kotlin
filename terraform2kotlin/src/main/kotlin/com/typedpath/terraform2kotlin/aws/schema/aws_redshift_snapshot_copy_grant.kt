package com.typedpath.terraform2kotlin.aws.schema

class aws_redshift_snapshot_copy_grant(val snapshot_copy_grant_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var kms_key_id: String? = null
 

}
