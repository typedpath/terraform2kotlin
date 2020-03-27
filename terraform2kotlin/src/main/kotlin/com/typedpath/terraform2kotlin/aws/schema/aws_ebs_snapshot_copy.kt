package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_ebs_snapshot_copy(val source_snapshot_id : String, val source_region : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var encrypted: Boolean? = null
  var tags: Map<String, String>? = null
  var description: String? = null
  var kms_key_id: String? = null
 

}
