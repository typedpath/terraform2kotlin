package com.typedpath.terraform2kotlin.aws.schema

class aws_ebs_volume(val availability_zone : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var tags: Map<String, String>? = null
  var encrypted: Boolean? = null
  var kms_key_id: String? = null
  var size: Int? = null
  var type: String? = null
  var iops: Int? = null
  var snapshot_id: String? = null
 

}
