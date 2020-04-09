package com.typedpath.terraform2kotlin.aws.schema
import com.typedpath.terraform2kotlin.ref

class aws_redshift_snapshot_copy_grant(val snapshot_copy_grant_name : String) :  com.typedpath.terraform2kotlin.Resource() {
	override fun typestring() ="resource"
	  var kms_key_id: String? = null
  var tags: Map<String, String>? = null
 

	fun idRef(subPath: String = "") = ref(this, "id", subPath)
}
